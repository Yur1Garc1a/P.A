import java.util.Scanner;
public class Desconto {
	public static void main(String[] args) {
		Double v1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor do produto:");
		v1 = ler.nextDouble();
		if (v1 <= 100) {
			System.out.println("O preco do produto sera de:" +v1);
		} else if ( v1 <= 500) {
			v1 = v1 - ((v1*5)/100);			
			System.out.println("O preco do produto sera de:" +v1);
		} else if ( v1<= 1000) {
			v1 = v1 - ((v1*10)/100);
			System.out.println("O preco do produto sera de:" +v1);
		} else if (v1 <=2000 ) {
			v1 = v1 - ((v1*15))/100;
			System.out.println("O preco do produto sera de:" +v1);
		} else {
			v1 = v1 - ((v1*20)/100);
			System.out.println("O preco do produto sera de:" +v1);
		}		
		
			ler.close();
	}
}
