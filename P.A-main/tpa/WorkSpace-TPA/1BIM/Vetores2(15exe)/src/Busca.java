import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Cria um espaço pra guardar 10 números
        int a[] = new int[10];

        // Pede pra digitar 10 números e vai guardando nesse espaço
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digita o " + i + "º número:");
            // Guarda temporariamente o número que a gente digitou
            int temp = in.nextInt();
            // Coloca esse número no espaço que a gente criou
            a[i] = temp;
        }

        // Pergunta qual número a gente quer achar nesse monte
        System.out.println("Qual número tu quer encontrar?");
        // Guarda temporariamente o número que a gente quer achar
        int tmp = in.nextInt();

        // Vai dando uma olhada em cada número que a gente digitou
        for (int i = 0; i < a.length; i++) {
            // Se achar o número que a gente quer, fala onde tá
            if (a[i] == tmp) {
                System.out.println("Achou! Tá na posição " + i);
                break;
            } else {
                // Se não for esse, continua procurando nos outros
                continue;
            }
        }

        // Beleza, pode fechar essa parada de pedir números
        in.close();
    }
}
