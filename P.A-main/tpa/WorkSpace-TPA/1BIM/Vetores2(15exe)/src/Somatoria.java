package vetores;

import java.util.Scanner;

public class Somatoria {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] A = new int[10];
	        int[] B = new int[10];


	        System.out.println("Digite os 10 elementos do vetor A:");
	        for (int i = 0; i < A.length; i++) {
	            A[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < B.length; i++) {
	            B[i] = 0;  
	            for (int j = i; j < A.length; j++) {
	                B[i] += A[j];  
	            }
	        }


	        System.out.println("Vetor B (somatórios):");
	        for (int i = 0; i < B.length; i++) {
	            System.out.println("B[" + i + "] = " + B[i]);
	        }
	        scanner.close();
	    }
	}

