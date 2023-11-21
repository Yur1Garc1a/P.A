package vetores;

public class Palindromo {

	    public static void main(String[] args) {
	        int[] vetorA = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1}; 

	        boolean palindromo = true;
	        int tamanho = vetorA.length;

	        for (int i = 0; i < tamanho / 2; i++) {
	            if (vetorA[i] != vetorA[tamanho - 1 - i]) {
	                palindromo = false;
	                break;
	            }
	        }

	        if (palindromo) {
	            System.out.println("O vetor é um palíndromo.");
	        } else {
	            System.out.println("O vetor não é um palíndromo.");
	        }
	    }
	}

