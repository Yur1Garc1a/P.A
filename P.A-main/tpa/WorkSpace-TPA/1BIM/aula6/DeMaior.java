import java.util.Scanner;
public class DeMaior {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int anoNasc,anoAtual,idade;
	System.out.println("Digite o ano atual:");
		anoAtual = in.nextInt();
	System.out.println("Digite o ano em que você nasceu:");
		anoNasc = in.nextInt();
	idade = anoAtual - anoNasc;
	System.out.println("Sua idade é: " +idade);
	if (idade >= 18) {
			System.out.println("Você é maior de idade");
	} else {
			System.out.println("Você é menor de idade");
			}
	}

}
