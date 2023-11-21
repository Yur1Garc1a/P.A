package vetores;

public class Potencia {
	    public static void main(String[] args) {
	        int[] A = new int[11];

	        
	        A[0] = 1; 
	        for (int i = 1; i < A.length; i++) {
	            A[i] = A[i - 1] * 2;
	        }
	        
	        for (int i = 0; i < A.length; i++) {
	            System.out.println("A[" + i + "] = " + A[i]);
	        }
	    }
	}


