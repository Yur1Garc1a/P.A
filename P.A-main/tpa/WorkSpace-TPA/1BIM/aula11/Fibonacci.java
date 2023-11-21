import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um numero");
		int v1 =  in .nextInt();
		int c = 0, b = 1,a = 0, e = 0;
		
		while(c < v1) {
			e = a + b;
			System.out.println(e);
			 a = b;
			 b = e;
			 c++;
			
		}
		in.close();
	}

}
