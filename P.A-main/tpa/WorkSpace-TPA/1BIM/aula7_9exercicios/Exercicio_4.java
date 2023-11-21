import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        double A, B, C, delta, x1, x2;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        A = leia.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        B = leia.nextDouble();
        
        System.out.println("Digite o valor de C: ");
        C = leia.nextDouble();
        
        double p1 = B * B;
        double p2 = -4 * A * C;
        delta = p1 + p2;

        if (delta < 0) {
            System.out.println("Não existem raízes reais para a equação.");
        } else if (delta == 0) {
            x1 = -B / (2 * A);
            System.out.println("Existe apenas uma raiz real para a equação: " + x1);
        } else {
            delta = Math.sqrt(delta);

            x1 = (-B + delta) / (2 * A);
            x2 = (-B - delta) / (2 * A);
            System.out.println("Existem duas raízes reais para a equação: " + x1 + " e " + x2);
        }
    }
}
