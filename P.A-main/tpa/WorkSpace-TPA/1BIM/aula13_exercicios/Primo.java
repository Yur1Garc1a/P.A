package aula13;

import java.util.Scanner;

public class Primo {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Insira um numero inteiro");
	int num = in.nextInt();
	if( num%2 == 0 ) {
		System.out.println(num+" n�o � um numero primo");
	}else {
		System.out.println(num+" � um numero primo");
	}
	in.close();
}
}
