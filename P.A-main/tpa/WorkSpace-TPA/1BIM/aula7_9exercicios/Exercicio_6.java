import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        n1 = leia.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        n2 = leia.nextInt();
        
        System.out.println("Digite o terceiro valor: ");
        n3 = leia.nextInt();
        
        if (n1 < n2 && n1 < n3) {
            System.out.print(n1 + " ");
            if (n2 < n3) {
                System.out.print(n2 + " ");
                System.out.print(n3);
            } else {
                System.out.print(n3 + " ");
                System.out.print(n2);
            }
        } else if (n2 < n1 && n2 < n3) {
            System.out.print(n2 + " ");
            if (n1 < n3) {
                System.out.print(n1 + " ");
                System.out.print(n3);
            } else {
                System.out.print(n3 + " ");
                System.out.print(n1);
            }
        } else {
            System.out.print(n3 + " ");
            if (n1 < n2) {
                System.out.print(n1 + " ");
                System.out.print(n2);
            } else {
                System.out.print(n2 + " ");
                System.out.print(n1);
            }
        }
    }
}
