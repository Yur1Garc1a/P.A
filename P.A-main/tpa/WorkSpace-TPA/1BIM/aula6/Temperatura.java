import java.util.Scanner;
public class Temperatura {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
			double  farerait ;
			int celsius;
		System.out.println("Digite a temperatura em fahrenheit:");
			farerait = in.nextDouble();
			celsius = (int) ((farerait-32)/1.8);
		System.out.println("A temperatura em graus celsius é de: " +celsius+"°");
		if ( celsius < 15) {
			System.out.println("Esta frio");
		} else if (celsius < 22) {
			System.out.println("Esta ameno");
		} else {
			System.out.println("Esta quente");
		}
	}
}
