package f;

public class Exercicio1 {
	public static void main(String[] args) {
		for(Integer i= 1; i <= 100; i++) {
			
			if (i%10==0) {
				System.out.println(i+" numero multiplo de 10");
			}else {
				System.out.println(i);
			}
		}
	}
}
