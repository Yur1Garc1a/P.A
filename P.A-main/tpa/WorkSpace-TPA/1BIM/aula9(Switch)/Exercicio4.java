import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int v1;
		System.out.println("Digite o codigo do produto");
		v1 = in.nextInt();
		switch(v1) {
		case 1:System.out.println("Produto:Cachorro quente/valor:8.00R$");break;
		case 2:System.out.println("Produto:Cheeseburguer/valor:12.00R$");break;
		case 3:System.out.println("Produto:x-salada/valor:15.00R$");break;
		case 4:System.out.println("Produto:Misto quente/valor:11.00R$");break;
		case 15:System.out.println("Produto:Pâo na chapa/valor:6.00R$");break;
		default:System.out.println("Codigo invalido");
		}
		in.close();}
	}