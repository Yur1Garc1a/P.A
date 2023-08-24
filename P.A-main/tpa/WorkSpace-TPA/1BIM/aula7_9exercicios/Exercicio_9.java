import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double sal, sal2;
        
        System.out.println("Digite o seu salário: ");
        sal = leia.nextDouble();
        
        if (sal >= 3582) {
            sal2 = sal * 27.5 / 100 - 662.94;
            System.out.println("O desconto do seu salário sera de R$" + sal2 );
        } else if (sal >= 2866.71) {
            sal2 = sal * 22.5 / 100 - 483.84;
            System.out.println("O desconto do seu salário sera de R$" + sal2 );
        } else if (sal >= 2150.01) {
            sal2 = sal * 15 / 100 - 268.84;
            System.out.println("O desconto do seu salário sera de R$" + sal2);
        } else if (sal >= 1434.60) {
            sal2 = sal * 7.5 / 100 - 107.59;
            System.out.println("O desconto do seu salário sera de R$" + sal2 );
        } else {
            System.out.println("Não terá desconto");
        }
    }
}

