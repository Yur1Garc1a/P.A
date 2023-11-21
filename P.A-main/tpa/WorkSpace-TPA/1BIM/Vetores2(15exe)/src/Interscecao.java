package vetores;

public class Interscecao {
	    public static void main(String[] args) {
	        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	        int[] B = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; 
	        
	        int tamanhoMaximo = A.length;

	        int[] C = new int[tamanhoMaximo];


	        int tamanhoC = 0;

	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < B.length; j++) {
	                if (A[i] == B[j]) {
	                    C[tamanhoC] = A[i];
	                    tamanhoC++;
	                    break;  
	                }
	            }
	        }

	        System.out.println("Vetor C (interseção de A e B):");
	        for (int i = 0; i < tamanhoC; i++) {
	            System.out.print(C[i] + " ");
	        }
	    }
	}


