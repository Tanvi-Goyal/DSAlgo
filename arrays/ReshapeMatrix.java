package arrays;

public class ReshapeMatrix {

	/*
	 In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different
	 size but keep its original data.
	 You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the 
	 row number and column number of the wanted reshaped matrix, respectively.
	 The reshaped matrix need to be filled with all the elements of the original matrix in the same 
	 row-traversing order as they were.
	 If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; 
	 Otherwise, output the original matrix.
	 */
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int m = nums.length;
        int n = nums[0].length;
        
        if(m*n != r*c) return nums;
        
        int[][] reshapedMatrix = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshapedMatrix[row][col] = nums[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return reshapedMatrix;
        
    }
}
