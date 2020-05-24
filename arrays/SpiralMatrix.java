package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	/*
	 Given a matrix of m x n elements (m rows, n columns),
	 return all elements of the matrix in spiral order.
	 */
	
	public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while (top <= bottom && left <= right) {
        	
        	for(int i = left; i <= right; i++) {
            	res.add(matrix[top][i]);
            }
            
        	top++;
        	
            for(int i = top; i <= bottom; i++) {
            	res.add(matrix[i][right]);
            }
            
            right--;
            
            if(top <= bottom) {
            	for(int i = right; i >= left; i--) {
                	res.add(matrix[bottom][i]);
                }
            }
            
            bottom--;
            
            if(left <= right) {
            	for(int i = bottom; i >= top; i--) {
                	res.add(matrix[i][left]);
                }
            }
            
            left++;
            
        }
          
        return res;
    }
}
