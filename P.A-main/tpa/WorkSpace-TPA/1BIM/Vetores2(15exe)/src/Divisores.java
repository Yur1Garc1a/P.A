package vetores;

import java.util.Scanner;

public class Divisores {
	    public static void main(String[] args) {
	        int[] A = new int[10];
	        Scanner in = new Scanner(System.in);

	        for (int i = 0; i < A.length; i++) {
	        	System.out.println("Digite o "+(i+1)+" numero");
	            A[i] = in.nextInt();
	        }


	        for (int i = 0; i < A.length; i++) {
	            System.out.print("Elemento A[" + i + "]: " + A[i] + " - Divisores: ");

	            for (int j = 1; j <= A[i]; j++) {
	                if (A[i] % j == 0) {
	                    System.out.print(j + " ");
	                }
	            }

	            System.out.println(); 
	        }
	        in.close();
	    }
	}


