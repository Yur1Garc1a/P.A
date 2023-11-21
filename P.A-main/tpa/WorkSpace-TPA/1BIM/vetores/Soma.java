package vetores;

import java.util.Scanner;

public class Soma {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int[] a= new int [10];
	for (int i = 0; i < a.length; i++) {
		System.out.println("digite o valor "+i+" da vetor a");
		a[i]= in.nextInt();
	}
	int[] b= new int [10];
	for (int i = 0; i < a.length; i++) {
		System.out.println("digite o valor "+i+" da vetor b");
		b[i]= in.nextInt();
	}
	int[] c= new int [10];
	for (int i = 0; i < a.length; i++) {
		c[i]= a[i]+b[i];
		System.out.println("A soma de "+a[i]+"+"+b[i]+" é igual a: "+c[i]);
	}
	in.close();
}
}
