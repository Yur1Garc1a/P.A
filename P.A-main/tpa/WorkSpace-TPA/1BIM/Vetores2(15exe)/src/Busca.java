package vetores;

import java.util.Scanner;

public class Busca {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int a[]= new int [10];
	for (int i = 0; i < a.length; i++) {
		System.out.println("Digite o "+i+"° numero");
		int temp = in.nextInt();
		a[i]=temp;
	}
	System.out.println("Qual elemento deseja buscar?");
	int tmp = in.nextInt();
	for (int i = 0; i < a.length; i++) {
		if(a[i] == tmp) {
			System.out.println("Este elemento está disponivel! Na "+i+"° posição");
			break;
		}else {
			continue;
		}
	}
	in.close();
}
}
