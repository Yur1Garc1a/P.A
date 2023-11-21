package matrizes;

import java.util.Random;

public class MaioreMenor {
	public static void main(String[] args) {
		Random random = new Random();
		int a[][] = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = random.nextInt(100);
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (a[i][j] > a[i][j + 1]) {
					continue;
				} else {
					int temp = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = temp;
				}
			}
			for (int j = 0; j < 2; j++) {
				if (a[i][j] > a[i][j + 1]) {
					continue;
				} else {
					int temp = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = temp;

				}
			}
			
		}
		
		for (int j = 0; j < 2; j++) {
			if(a[j][0]>a[j+1][0]) {
				continue;
			}else {
				int temp = a[j][0];
				a[j][0]=a[j+1][0];
				a[j+1][0]= temp;
			}
		}
		
		for (int j = 0; j < 2; j++) {
			if(a[j][2]<a[j+1][2]) {
				continue;
			}else {
				int temp = a[j][2];
				a[j][2]=a[j+1][2];
				a[j+1][2]= temp;
			}
		}
		
		for (int j = 0; j < 2; j++) {
			if(a[j][2]<a[j+1][2]) {
				continue;
			}else {
				int temp = a[j][2];
				a[j][2]=a[j+1][2];
				a[j+1][2]= temp;
			}
		}
		
		System.out.println("O maior numero é o:" +a[0][0]+" Localizado na coluna 0 e linha 0");
		System.out.println("O menor numero é o:" +a[0][2]+" Localizado na coluna 0 e linha 2");
	}
}
