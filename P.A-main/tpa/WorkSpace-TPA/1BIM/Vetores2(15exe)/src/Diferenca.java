package vetores;

public class Diferenca {
	    public static void main(String[] args) {
	        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
	        int[] B = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; 

	        int[] C = new int[A.length];


	        int tamanhoC = 0;

	        for (int i = 0; i < A.length; i++) {
	            boolean encontradoEmB = false;
	            for (int j = 0; j < B.length; j++) {
	                if (A[i] == B[j]) {
	                    encontradoEmB = true;
	                    break;
	                }
	            }
	            if (!encontradoEmB) {
	                C[tamanhoC] = A[i];
	                tamanhoC++;
	            }
	        }

	        if (tamanhoC > 0) {
	            System.out.println("Vetor C (diferença de A e B):");
	            for (int i = 0; i < tamanhoC; i++) {
	                System.out.print(C[i] + " ");
	            }
	        } else {
	            System.out.println("Não há diferença entre A e B");
	        }
	    }
	}


