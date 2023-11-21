import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int i1, i2, i3, i4, i5;
        String n1, n2, n3, n4, n5;
        
        System.out.println("Digite o primeiro nome: ");
        n1 = leia.nextLine();
        System.out.println("Digite a idade do primeiro nome: ");
        i1 = leia.nextInt();
        
        leia.nextLine();
        System.out.println("Digite o segundo nome: ");
        n2 = leia.nextLine();
        System.out.println("Digite a idade do segundo nome: ");
        i2 = leia.nextInt();
        
        leia.nextLine();
        System.out.println("Digite o terceiro nome: ");
        n3 = leia.nextLine();
        System.out.println("Digite a idade do terceiro nome: ");
        i3 = leia.nextInt();
        
        leia.nextLine();
        System.out.println("Digite o quarto nome: ");
        n4 = leia.nextLine();
        System.out.println("Digite a idade do quarto nome: ");
        i4 = leia.nextInt();
        
        leia.nextLine();
        System.out.println("Digite o quinto nome: ");
        n5 = leia.nextLine();
        System.out.println("Digite a idade do quinto nome: ");
        i5 = leia.nextInt();
        
        if (i1 > i2 && i1 > i3 && i1 > i4 && i1 > i5) {
            System.out.println("O usuário mais velho é " + n1 + " com " + i1 + " anos.");
        } else if (i2 > i3 && i2 > i4 && i2 > i5) {
            System.out.println("O usuário mais velho é " + n2 + " com " + i2 + " anos.");
        } else if (i3 > i4 && i3 > i5) {
            System.out.println("O usuário mais velho é " + n3 + " com " + i3 + " anos.");
        } else if (i4 > i5) {
            System.out.println("O usuário mais velho é " + n4 + " com " + i4 + " anos.");
        } else {
            System.out.println("O usuário mais velho é " + n5 + " com " + i5 + " anos.");
        }
        
        if (i1 < i2 && i1 < i3 && i1 < i4 && i1 < i5) {
            System.out.println("O usuário mais novo é " + n1 + " com " + i1 + " anos.");
        } else if (i2 < i3 && i2 < i4 && i2 < i5) {
            System.out.println("O usuário mais novo é " + n2 + " com " + i2 + " anos.");
        } else if (i3 < i4 && i3 < i5) {
            System.out.println("O usuário mais novo é " + n3 + " com " + i3 + " anos.");
        } else if (i4 < i5) {
            System.out.println("O usuário mais novo é " + n4 + " com " + i4 + " anos.");
        } else {
            System.out.println("O usuário mais novo é " + n5 + " com " + i5 + " anos.");
        }
    }
}
