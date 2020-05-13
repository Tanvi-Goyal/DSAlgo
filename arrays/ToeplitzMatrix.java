package arrays;

public class ToeplitzMatrix {

	/*
	 A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
	 Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
	 */
	
	 public boolean isToeplitzMatrix(int[][] matrix) {
	        
	        int nRows = matrix.length;
	        int nCol = matrix[0].length;
	        
	        for(int i= 1; i< nRows; i++) {
	            for(int j = 1; j< nCol; j++) {
	                if(matrix[i][j] != matrix[i-1][j-1]) return false;
	            }
	        }
	        
	        return true;
	    }
}
