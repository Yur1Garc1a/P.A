import java.util.Scanner;
public class ExercicioVolume {
	Public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		   Double pi,raio,altura,volume ;
		    pi= 3.14;
		 System.out.println("Digite o raio do cilindro");
		    raio = in.nextDouble();
		 System.out.println("Digite a altura do cilindro");
		    altura  = in.nextDouble();
		    raio = raio*raio;
		    volume = (pi*raio)*altura;
		 System.out.println("O volume do cilindro é " +volume);
		}
}
