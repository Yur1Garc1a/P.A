package f;

public class Exercicio3 {
	public static void main(String[] args) {
		int t = 0;
	for (int i = 1; i < 11; i++) {
		 	int n = 1;
			while (n< 11) {
				t = n * i;
				System.out.println(n + "x" + i + "=" + t);
				n++;
			}
		}
	}
}
