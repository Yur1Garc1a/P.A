package dowhile;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer continuar;

        do {
            System.out.println("Digite o ano atual:");
            int anoAtual = scanner.nextInt();

            System.out.println("Digite o ano de nascimento:");
            int anoNascimento = scanner.nextInt();

            int idade = anoAtual - anoNascimento;

            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }

            System.out.println("Sua idade é " + idade + " anos.");
            System.out.println("Deseja continuar a execução? (1-para SIM ou 2-para NÃO)");
            continuar = scanner.nextInt();
        } while (continuar != 2);

        System.out.println("Programa encerrado.");
    }
}