import java.util.Scanner;
public class Salario{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int salminimo,sal,equivale;
	System.out.println("Digite seu salário:");
		sal = in.nextInt();
	System.out.println("Digite o Salário minimo de sua região:");
		salminimo = in.nextInt();
		equivale = sal/salminimo;
	if (sal>=salminimo) {
			System.out.println("Seu salário é adequado e equivale a " +equivale+" salário(s) minimos");
	} else {
			System.out.println("Seu salário não é adequado. Pobre e equivale a "+equivale+" salário(s) minimos");
			}
	 in.close();
	}

}
