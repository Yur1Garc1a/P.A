package aula13;

public class Tabuada {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i <= 9; i++) {
			num++;
			for (int j = 0; j <= 10; j++) {
				int resp = j * num;
				System.out.println(num + "X" + j + "=" + resp);
			}
			System.out.println("\n");
		}
	}
}
