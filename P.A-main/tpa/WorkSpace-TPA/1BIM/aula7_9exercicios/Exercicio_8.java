import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n1, n2, n3;
        double media;
        
        System.out.println("Digite a primeira nota: ");
        n1 = leia.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextInt();
        
        media = (n1 + n2) / 2.0;
        
        System.out.println("Sua média é: " + media);
        
        if (media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Está em exame");
            System.out.println("Digite a nota do exame: ");
            n3 = leia.nextInt();
            
            media = (media + n3) / 2;
            
            if (media >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
