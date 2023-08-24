import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int v1;
		System.out.println("Informe a idade do aluno");
		v1 = in.nextInt();
		switch(v1) {
		case 6:System.out.println("Dente de leite");break;
		case 7:System.out.println("junior");break;
		case 8:System.out.println("junior max");break;
		case 9:System.out.println("junior master");break;
		case 10:System.out.println("master");break;
		default:System.out.println("Idade invalida");
		}
		in.close();}
	}