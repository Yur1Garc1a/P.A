import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        int anoNasc, anoAtual, idade;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o ano em que você nasceu: ");
        anoNasc = leia.nextInt();
        
        System.out.println("Digite o ano atual: ");
        anoAtual = leia.nextInt();
        
        idade = anoAtual - anoNasc;
        System.out.println("Idade: " + idade);
        
        if (idade < 10) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else if (idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
        leia.close();
    }
}
