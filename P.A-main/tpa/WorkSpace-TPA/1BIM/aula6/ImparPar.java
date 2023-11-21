import java.util.Scanner;
public class ImparPar{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		long numero;
	System.out.println("Digite um numero:");
		numero = in.nextInt();
	if (numero == 0) {
			System.out.println("esse numero é neutro ()zero");
	} else if (numero > 0){
			System.out.println("esse numero é positivo");
	} else {
			System.out.println("esse numero é negativo");	
			}
	 in.close();
	}

}

,