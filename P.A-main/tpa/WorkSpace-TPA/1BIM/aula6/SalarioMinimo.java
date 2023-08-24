import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        double salarioMinimo = 1302;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        double salUsuario = scanner.nextDouble();
        if (salUsuario > salarioMinimo) {
            System.out.println("Seu salário está acima do salário mínimo.");
        } else if (salUsuario < salarioMinimo) {
            System.out.println("Seu salário está abaixo do salário mínimo.");
        } else {
            System.out.println("Seu salário é igual ao salário mínimo.");
        }
    }
}