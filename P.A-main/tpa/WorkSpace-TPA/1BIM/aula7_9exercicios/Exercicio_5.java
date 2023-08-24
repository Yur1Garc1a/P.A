import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        int A, B, C;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        A = leia.nextInt();
        
        System.out.println("Digite o valor de B: ");
        B = leia.nextInt();
        
        System.out.println("Digite o valor de C: ");
        C = leia.nextInt();
        
        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            if (A == B && B == C) {
                System.out.println("Triângulo Equilátero");
            } else if (A == B || B == C || A == C) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é possível formar um triângulo com essas medidas.");
        }
    }
}
