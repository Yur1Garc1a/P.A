import java.util.Scanner;

public class ParesEImpares2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[20];
		int b[] = new int[20];
		int c1 = 0, c2 = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite o " + i + "° valor");
			a[i] = in.nextInt();
			if (a[i] % 2 == 0) {
				c1++;
			} else {
				c2++;
			}

		}
		c2= 20-c2;
		c1=c2-1;
		for (int i = 0; i < b.length; i++) {
			if (a[i] % 2 == 0) {
				b[c1] = a[i];
				c1--;
			} else {
				b[c2] = a[i];
				c2++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
			
			in.close();
	}
}
