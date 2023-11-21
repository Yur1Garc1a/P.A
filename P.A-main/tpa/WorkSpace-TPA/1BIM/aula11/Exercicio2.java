import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero");
		long f = in.nextLong();
		long c = f - 1;
		long b = f;
		while (c != 1) {

			f = f * c;

			c--;

		}
		System.out.println(b + "! = " + f);
		in.close();
	}

}
