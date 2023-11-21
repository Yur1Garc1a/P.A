package vetores;

import java.util.Scanner;

public class Invertido {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int [] a= new int [10];
	int[] b = new int [10];
	int c = 9;
	for (int i = 0; i < a.length; i++) {
		System.out.println("Digite o valor de numero "+i+"°");
		a[i]= in.nextInt();
		b[c] = a[i];
		c--;
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
	in.close();
}
}
