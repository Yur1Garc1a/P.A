import java.util.Scanner;
public class ExercicioProduto {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		Double valorProduto, lucro,valorVenda;
		System.out.println("Digite o preço do produto");
		 	valorProduto = in.nextDouble();
		System.out.println("Digite o valor do lucro a receber");
			lucro = in.nextDouble();
			lucro = (valorProduto*lucro)/100;
			valorVenda = valorProduto-lucro;
			System.out.println("O valor do produto a ser vendido será de" +valorVenda);	
		
	}
}
