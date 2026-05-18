package src.com.semanticsquare.basics;

class DotProductCalculator {

	

	public static int dotProduct(int[]a, int[]b) {

	    int dotValue = 0;
	
	    for(int i = 0; i < a.length; i++) {

		for(int j = i; j <= i; j++) {
			
		    dotValue += a[i] * b[j];
		
		}
	     }
	     return dotValue;
	}

	public static int[][] addMatrices(int[][] matrixA, int [][] matrixB) {
		
		int rows = matrixA.length;
		int columns = matrixB.length;

		int result[][] = new int[rows][columns];

		for(int j = 0; j < rows; j++) {

		    for(int k = 0; k < columns; k++) {
	
			result[j][k] = matrixA[j][k] + matrixB[j][k];

		    }
		
		}
		return result;
      	}


	public static void main(String[] args) {

	int[]a = {1,2,3};
	int[]b = {4,5,6};

	int result = DotProductCalculator.dotProduct(a,b);

	System.out.println("dot product result is " + result);

	int[][]c = {{1,2,3},{4,5,6},{7,8,9}};
	int[][]d = {{9,8,7},{6,5,4},{3,2,1}};

	int[][] resultAdd = DotProductCalculator.addMatrices(c,d);
	

	for(int j = 0; j < c.length; j++) {

	    for(int k = 0; k < d.length; k++) {
	
		System.out.print(resultAdd[j][k] + " ");
	     }	
		System.out.println("");     
	}

    }
} 