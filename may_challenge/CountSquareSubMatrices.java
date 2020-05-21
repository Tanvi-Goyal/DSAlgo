package may_challenge;

public class CountSquareSubMatrices {

	/*
	 Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
	 */
	
	public int countSquares(int[][] matrix) {
        
        int count = 0;
        
        int nRows = matrix.length;
        int nCols = matrix[0].length;
        
        for(int i=0; i<nRows; i++) {
            for(int j=0; j< nCols; j++) {
                if(matrix[i][j] > 0 && i > 0 && j > 0) {
                    matrix[i][j] = Math.min(matrix[i-1][j-1], Math.min(matrix[i][j-1], matrix[i-1][j])) + 1;
                } 
                
                count+=matrix[i][j];
            }
        }
        return count;
    }
}
