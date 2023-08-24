import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int v1;
		System.out.println("Entre com o ultimo numero da placa");
		v1 = in.nextInt();
		switch (v1){
		case 1: ;
		case 2: System.out.println("Segunda-feira");break;
		case 3: ;
		case 4: System.out.println("terca-feira");break;
		case 5: ;
		case 6: System.out.println("quarta-feira");break;
		case 7:;
		case 8: System.out.println("quinta-feira");break;
		case 9:;
		case 0: System.out.println("sexta-feira");break;
		default: System.out.println("Numero de placa invalido");
		}
		
		in.close();
	}

}
