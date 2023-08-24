import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int v1,v2;
		System.out.println("Digite o Mes em que nasceu");
		v1 = in.nextInt();
		switch(v1) {
		case 1:
			System.out.println("Digite o dia");
			v2 = in.nextInt();
			if (v2 <= 20) {System.out.println("Capricornio");}
			else {System.out.println("Aquario");}break;
			
		case 2:	System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 < 19) {System.out.println("Aquario");}
		else {System.out.println("Peixes");}break;
		
		case 3:System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 <= 20) {System.out.println("Peixes");}
		else {System.out.println("Aries");}break;
			
		case 4:System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 <= 20) {System.out.println("Aries");}
		else {System.out.println("Touro");}break;
			
		case 5:System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 <= 20) {System.out.println("Touro");}
		else {System.out.println("Gemeos");}break;
			
		case 6:System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 <= 20) {System.out.println("Gemeos");}
		else {System.out.println("Cancer");}break;
			
		case 7:System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 <= 22) {System.out.println("Cancer");}
		else {System.out.println("Leao");}break;
			
		case 8:System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 <= 22) {System.out.println("Leao");}
		else {System.out.println("virgem");}break;
			
		case 9:System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 <= 22) {System.out.println("Virgem");}
		else {System.out.println("Libra");}break;
		
		case 10:System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 <= 22) {System.out.println("Libra");}
		else {System.out.println("escorpiao");}break;
			
		case 11:System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 <= 21) {System.out.println("escorpiao");}
		else {System.out.println("Sagitario");}break;
			
		case 12:System.out.println("Digite o dia");
		v2 = in.nextInt();
		if (v2 <= 21) {System.out.println("Sagitario");}
		else {System.out.println("Capricornio");}break;
		default:System.out.println("mes invalido");
			}
		in.close();
	}
}
