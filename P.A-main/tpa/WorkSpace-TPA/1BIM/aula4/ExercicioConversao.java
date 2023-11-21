import java.util.Scanner;
public class ExercicioConversao {
	public static void main (String[] args) {
	 Scanner in= new Scanner(System.in);
	int dias ,meses ,anos ;
	System.out.println("Digite o valor de dias");
	dias=in.nextInt();
	meses=dias/30;
	anos=dias/365;
	System.out.println("são " +meses+ " mes(es) e "  +anos+ " ano(s)");
	
			
	
	
			
	}
}
