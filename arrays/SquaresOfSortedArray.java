package arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {

	/* 
	 Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, 
	 also in sorted non-decreasing order. 
	 */
	
	 public int[] sortedSquares(int[] A) {
	        int ans[] = new int[A.length];
	        for(int i = 0;i<A.length; i++) {
	            ans[i] = A[i] * A[i];
	        }
	        
	        Arrays.sort(ans);
	        return ans;
	    }
}
