import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=1,r,n;
		System.out.println("Informe um numero");
		n = in.nextInt();
		while(i<=10) {
			r = i*n;
			System.out.println(n+"X"+i+"="+r);
			i++;
		}
		
		in.close();
	}

}
