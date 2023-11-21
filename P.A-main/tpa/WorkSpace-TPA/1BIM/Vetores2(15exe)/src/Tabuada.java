import java.util.Scanner;

public class Tabuada {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a[]=new int [5];
	int b=1;
	for (int i = 0; i < a.length; i++) {
		System.out.println("Escreva o "+i+"° numero");
		a[i]=in.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println("\n");
		for (int j = 0; j < 10; j++) {
			int r = a[i]*b;
			System.out.println(a[i]+"X"+b+":"+r);
			b++;
			
		}
		b=1;
	}
	in.close();
}
}
