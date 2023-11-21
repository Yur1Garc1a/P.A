package matrizes;

import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		Random random = new Random();
		int cartela[][] = new int[4][4], jogadas = 0, rod = 0;
		int cj = 0;
		for (int i = 0; i < cartela.length; i++) {
			for (int j = 0; j < cartela.length; j++) {
				cartela[i][j] = random.nextInt(75);
			}
		}
		System.out.println("Sua cartela:");
		for (int i = 0; i < cartela.length; i++) {
			for (int j = 0; j < cartela.length; j++) {
				System.out.println(cartela[i][j]);
			}
		}
		do {

			int temp = random.nextInt(75), vorf = 0;
			System.out.println("Rodada " + rod + " numero:" + temp);
			for (int i = 0; i < cartela.length; i++) {
				for (int j = 0; j < cartela.length; j++) {
					if (temp == cartela[i][j]) {
						jogadas++;
						vorf = 1;
					}
				}
			}
			if (vorf == 0) {
				System.out.println("Que pena, não esta na sua cartela");
			} else {
				System.out.println("Oba! Esse numero está na sua cartela");
			}
			System.out.println("\n");
			rod++;
			cj++;
		} while (jogadas < 16);

		System.out.println("BINGO!");
		System.out.println("Total de rodadas: " + cj);

	}
}
