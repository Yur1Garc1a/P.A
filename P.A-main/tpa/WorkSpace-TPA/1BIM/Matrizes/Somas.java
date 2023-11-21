package matrizes;

import java.util.Random;

public class Somas {
	public static void main(String[] args) {
		int a[][] = new int[3][4];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = random.nextInt(2000);
			}
		}

		for (int i = 0; i < 3; i++) {
			a[i][3] = a[i][0] + a[i][1] + a[i][2];
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 3){
					System.out.println(a[i][j] + " Soma");
				} else {
					System.out.println(a[i][j]);

				}
			}
			System.out.println("\n");
		}
	}
}
