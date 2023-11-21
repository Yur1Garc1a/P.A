import java.util.Scanner;

public class BiAi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Vetores para armazenar os valores inteiro até 10
        int a[] = new int[10];
        int b[] = new int[10];

        // Preenchendo o vetor A e calculando o vetor B
        //esse a.lenght é para pegar do a o tamho dele ent no caso
	//se i < que o tamanho do vetor a . continuar incrementando valor (;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o " + i + "° numero: ");
            a[i] = in.nextInt();

            // Verificando se o número é par ou ímpar e preenchendo o vetor B
	    // Operador condicional ternário
            b[i] = (a[i] % 2 == 0) ? 1 : 0;
	    //(a[i] % 2 == 0) Verifica se o número em a[i] é par.
	    //?: Se a condição ai de cima for verdadeira (ou seja, se a[i] for par)   
            //1 é o valor que ira atribuir posição correspondente em b.
	    // e os dois : é tipo, se não for isso botá zero 
		
        }

        // Exibindo o vetor B
        for (int i = 0; i < b.length; i++) {
            System.out.println("Vetor B | " + i + "° posição: " + b[i]);
        }


    }
}
