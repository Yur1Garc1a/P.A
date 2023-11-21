package vetores;

import java.util.Scanner;

public class BiAi {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int a[]= new int[10];
	int b[]= new int[10];
	for (int i = 0; i < b.length; i++) {
		System.out.println("Digite o "+i+"° numero ");
		a[i]= in.nextInt();
		if(a[i]%2 ==0) {
			b[i]=1;
		}else {
			b[i]=0;
		}
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println("Vetor B|"+i+"° posição:"+b[i]);
		
	}
	in.close();
}
}
