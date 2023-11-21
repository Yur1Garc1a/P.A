package aula13;
import java.util.Scanner;
public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fx1=0,fx2=0,fx3=0,fx4=0,fx5=0,cM = 1,cfx1 = 0,cfx2=0,cfx3=0,cfx4=0,cfx5=0, idade=0;
		for(int i=1; i<=15;i++){
			System.out.println("Qual a idade da "+cM+"° pessoa?");
			 idade = in.nextInt();
			if(idade <= 15 ) {
				fx1 = fx1+idade;
				cfx1++;
			} else if(idade<=30) {
				fx2 = fx2+idade;
				cfx2++;
			} else if(idade <= 45) {
				fx3 = fx3+ idade;
				cfx3++;
			} else if(idade <= 60){
				fx4 = fx4+ idade;
				cfx4++;
			}else {
				fx5 = fx5+ idade;
				cfx5++;
			}
			cM++;
		}
		System.out.println("Faixa etaria até 15: "
				+ "     Numero de pessoas: "+cfx1
				+" Porcentagem do total de alunos: "+(cfx1*100/15)+"%");
		
		System.out.println("Faixa etaria de 16 a 30: "
				+ " Numero de pessoas: "+cfx2
				+"  Porcentagem do total de pessoas: "+(cfx2*100/15)+"%");
		
		System.out.println("Faixa etaria de 31 a 45: "
				+ " Numero de pessoas: "+cfx3
				+"  Porcentagem do total de pessoas: "+(cfx3*100/15)+"%");
		
		System.out.println("Faixa etaria de 41 a 60: "
				+ " Numero de pessoas: "+cfx4
				+"  Porcentagem do total de pessoas: "+(cfx4*100/15)+"%");
		
		System.out.println("Faixa etaria de 61 acima: "
				+ "Numero de pessoas: "+cfx5
				+"  Porcentagem do total de pessoas: "+(cfx5*100/15)+"%");
		in.close();
	}
}
