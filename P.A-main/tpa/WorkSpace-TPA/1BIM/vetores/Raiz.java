package vetores;

import java.util.Scanner;

public class Raiz{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	int []a = new int [10];
	for (int i = 0; i < a.length; i++) {
		System.out.println("Digite o "+i+"° valor");
		a[i] = in.nextInt();
	}
	int []b = new int [10];
	for (int i = 0; i < b.length; i++) {
		b[i] = a[i]*(a[i]);
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println("A raiz quadrada de "+a[i]+" é: "+b[i]);
	}
	in.close();
	}
}
