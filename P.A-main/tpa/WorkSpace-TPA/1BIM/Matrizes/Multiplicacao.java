package matrizes;

public class Multiplicacao {

	public static void main(String[] args) {
		int a[][]= new int[4][4];
		a[0][0] =2;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if(i>0) {
					a[i][0] = a[i-1][3]+a[i-1][3];
					a[i][j]= a[i][j-1]+a[i][j-1];
					continue;
				}else {
					a[i][j]= a[i][j-1]+a[i][j-1];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
