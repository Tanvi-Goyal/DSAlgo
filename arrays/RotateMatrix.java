package arrays;

public class RotateMatrix {

	/*
	 You are given an n x n 2D matrix representing an image.

	 Rotate the image by 90 degrees (clockwise).
	 */
	
	public void rotate(int[][] matrix) {
        
        // transpose matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }        
        }
        
        // flip horizontally -> swap columns
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length -1 -j];
                matrix[i][matrix[0].length -1 -j] = temp;
            }        
        }
    }
}
