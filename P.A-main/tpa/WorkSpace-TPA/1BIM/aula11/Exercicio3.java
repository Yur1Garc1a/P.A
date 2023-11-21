import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um numero");
		int a = in.nextInt();
		System.out.println("Insira a potencia");
		int b = in.nextInt();
		int c = 0;
		int t = 1;
		while (c != b) {
			t = t * a;
			c++;
		}
		System.out.println("Resultado: " + t);
		in.close();
	}

}
