import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Escreva o " + i + "° numero");
			a[i] = in.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0 || a[i] % 2 == 0) {
				if (a[i] == 3||a[i] == 2) {
					System.out.println(a[i] + " É um numero primo");
				} else {
					System.out.println(a[i]);
				}
			} else {
				if(a[i]==1||a[i]%5==0) {
					System.out.println(a[i]);
				}else {
				System.out.println(a[i] + " É um numero primo");}

			}
		}

		in.close();
	}
}
