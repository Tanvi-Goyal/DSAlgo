package arrays;

public class SpiralMatrixII {

	/*
	 Given a positive integer n, generate a square matrix filled with elements 
	 from 1 to n2 in spiral order.
	 */
	
	public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        int k = 1;
        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        
        while (top <= bottom && left <= right) {
        	
        	for(int i = left; i <= right; i++) {
                matrix[top][i] = k++;
            }
            
        	top++;
        	
            for(int i = top; i <= bottom; i++) {
            	matrix[i][right] = k++;;
            }
            
            right--;
            
            if(top <= bottom) {
            	for(int i = right; i >= left; i--) {
                	matrix[bottom][i] = k++;
                }
            }
            
            bottom--;
            
            if(left <= right) {
            	for(int i = bottom; i >= top; i--) {
                	matrix[i][left] = k++;
                }
            }
            
            left++;    
        }
        
        return matrix;
    }
}
