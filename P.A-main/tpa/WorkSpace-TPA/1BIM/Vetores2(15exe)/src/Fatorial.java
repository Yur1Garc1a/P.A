package vetores;

public class Fatorial {
	    public static void main(String[] args) {
	        int[] A = new int[15];
	        long[] B = new long[15];

	        for (int i = 0; i < A.length; i++) {
	            A[i] = i + 1;
	        }

	        for (int i = 0; i < A.length; i++) {
	            B[i] = 1;
	            for (int j = 1; j <= A[i]; j++) {
	                B[i] *= j;  
	            }
	        }


	        for (int i = 0; i < B.length; i++) {
	            System.out.println("B[" + i + "] = " + B[i]);
	        }
	    }
	}


