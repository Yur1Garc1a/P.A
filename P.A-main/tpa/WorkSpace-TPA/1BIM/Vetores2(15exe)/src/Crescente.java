package vetores;

import java.util.Scanner;

public class Crescente {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a[]=new int [10], b[] = new int[10], c[]=new int[10], o=9;
	for (int i = 0; i < c.length; i++) {
		System.out.println("Digite o "+i+"° numero");
		a[i]=in.nextInt();
		c[i]=a[i];
	}
	
	for (int i = 0; i <9; i++) {
		for (int k = 0; k < 9; k++) {
			if(c[k]>c[k+1]) {
				continue;
			}else {
				int j = c[k];
				c[k]=c[k+1];
				c[k+1]=j;
			}
		}
	}
	for (int i = 0; i < c.length; i++) {
		b[o]=c[i];
		o--;
	}
	System.out.println("Decrescente");
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i] );
	}
	System.out.println("\n");
	System.out.println("Crescente");
	for (int i = 0; i < c.length; i++) {
		System.out.println(b[i]);
	}
	in.close();
}
}
