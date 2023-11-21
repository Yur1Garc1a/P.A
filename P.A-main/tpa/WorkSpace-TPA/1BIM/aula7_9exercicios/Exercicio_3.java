import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o peso (em kg): ");
        peso = leia.nextDouble();
        
        System.out.println("Digite a altura (em metros): ");
        altura = leia.nextDouble();
        
        imc = peso / (altura * altura);
        System.out.println("Este é o IMC: " + imc);
        
        if (imc < 18.5) {
            System.out.println("Excesso de magreza");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Excesso de peso");
        } else if (imc < 35) {
            System.out.println("Obesidade (Grau 1)");
        } else if (imc < 40) {
            System.out.println("Obesidade (Grau 2)");
        } else {
            System.out.println("Obesidade (Grau 3)");
        }
    }
}
