package vetores;

import java.util.Scanner;

public class VetorC {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int a[]= new int[10];
	int b[]= new int[10];
	int c[]= new int[10];
	for (int i = 0; i < c.length; i++) {
		System.out.println("Digite o "+i+"° numero de A");
		a[i] = in.nextInt();
		System.out.println("Digite o "+i+"° numero de B");
		b[i] = in.nextInt();
		if(a[i]>b[i]) {
			c[i]=1;
		} else if(a[i]==b[i]) {
			c[i]=0;
		}else {
			c[i]=-1;
		}
	}
	for (int i = 0; i < c.length; i++) {
		System.out.println("Vetor C | "+i+"° posição:"+c[i]);
	}
	in.close();
	
}
}

