import java.util.Scanner;
public class ExercicioAB {
	public static void main(String [] args) {
		try (Scanner in = new Scanner (System.in)) {
			double a,b,c;
			System.out.println("Entre com o valor de A ");
			a = in.nextDouble();
			System.out.println("Entre com o valor de B");
			b = in.nextDouble();
			c=0;		
			//inverter valores
			c=a;
			a=b;
			b=c;
			System.out.println("O valor de A é " +a+ "O valor de B é " +b);
		}
				
		
}
}