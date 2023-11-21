import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mes, dia;

        System.out.println("Digite o mês em que nasceu");
        mes = in.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido");
        } else {
            System.out.println("Digite o dia");
            dia = in.nextInt();

		// Usei o operador condicional ternário//
		//? verifica se a condição é verdeira, em seguida a damos a primeira resposta caso seja
		// depois vem : e do outro lado a resposta caso não seja
            switch (mes) {
                case 1:
                    System.out.println(dia <= 20 ? "Capricórnio" : "Aquário");
                    break;
                case 2:
                    System.out.println(dia < 19 ? "Aquário" : "Peixes");
                    break;
                case 3:
                    System.out.println(dia <= 20 ? "Peixes" : "Áries");
                    break;
                case 4:
                    System.out.println(dia <= 20 ? "Áries" : "Touro");
                    break;
                case 5:
                    System.out.println(dia <= 20 ? "Touro" : "Gêmeos");
                    break;
                case 6:
                    System.out.println(dia <= 20 ? "Gêmeos" : "Câncer");
                    break;
                case 7:
                    System.out.println(dia <= 22 ? "Câncer" : "Leão");
                    break;
                case 8:
                    System.out.println(dia <= 22 ? "Leão" : "Virgem");
                    break;
                case 9:
                    System.out.println(dia <= 22 ? "Virgem" : "Libra");
                    break;
                case 10:
                    System.out.println(dia <= 22 ? "Libra" : "Escorpião");
                    break;
                case 11:
                    System.out.println(dia <= 21 ? "Escorpião" : "Sagitário");
                    break;
                case 12:
                    System.out.println(dia <= 21 ? "Sagitário" : "Capricórnio");
                    break;
            }
        }

        in.close();
    }
}           
