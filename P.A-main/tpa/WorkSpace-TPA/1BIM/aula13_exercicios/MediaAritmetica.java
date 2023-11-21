package aula13;

public class MediaAritmetica {
	public static void main(String[] args) {
		int c = 13, soma = 0, cons = 60;
		for (int i = 13; i <= 73; i++) {
			soma = soma+c;	
			c++;
		}
		System.out.println((soma/cons)+" é a media aritmetica de 13 a 73");
	}
}
