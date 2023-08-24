import java.util.Scanner;
public class Teatro {
	public static void main(String[] args) {
		double con, ing;
		String est;
		con = 21;
		Scanner ler = new Scanner (System.in);
		System.out.println("Voce é estudante?");
		est = ler.next();
		if(est.equalsIgnoreCase("Sim")) {
			ing = con/2;
			System.out.println("O ingresso sera de: "+ing);
		} else {
			System.out.println("O ingresso sera de: "+con);
		}
		
		ler.close();
	}

}
