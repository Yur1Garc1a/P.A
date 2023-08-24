import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        System.out.print("Digite um número: ");
         numero = scanner.nextDouble();
        if (numero == 0) {
            System.out.println("O número é neutro (zero).");
        } else if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
    }
}