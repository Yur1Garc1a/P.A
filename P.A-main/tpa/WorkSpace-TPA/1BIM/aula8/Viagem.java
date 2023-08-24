import java.util.Scanner;
public class Viagem {
	public static void main(String[] args) {
		double total, pass, vol;
		String passS, ass;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o valor da passagem");
		pass = ler.nextDouble();
		System.out.println("Voce quer despachar bagagem?");
		passS = ler.next();
		if (passS.equalsIgnoreCase("Sim")) {
			System.out.println("Quantos volumes?");
			vol = ler.nextDouble();
			vol = vol*90;
			System.out.println("Voce quer marcar assento?");
			ass = ler.next();
			if(ass.equalsIgnoreCase("sim")) {
				total = pass+vol+60;
				System.out.println("O total da viagem sera de:" +total);
			} else {
				total = pass+vol;
				System.out.println("O total da viagem sera de:" +total);
			}	
		} else {
			vol = 0;
			System.out.println("Voce quer marcar assento?");
			ass = ler.next();
			if(ass.equalsIgnoreCase("sim")) {
				total = pass+vol+60;
				System.out.println("O total da viagem sera de:" +total);
			} else {
				total = pass+vol;
				System.out.println("O total da viagem sera de:" +total);
			}
		}
		ler.close();
	}

}

