package f;

public class Exercicio2 {
	public static void main(String[] args) {
		for(int i =1; i<=2023; i++) {
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.println(i);
			}
		}
	}
}
