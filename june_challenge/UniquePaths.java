package june_challenge;

public class UniquePaths {
	/*
	 A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

	 The robot can only move either down or right at any point in time. 
	 The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' 
	 in the diagram below).

	 How many possible unique paths are there?
	 */
	
	public int uniquePaths(int m, int n) {
       
       int[][] dp = new int[m][n];
       
       for (int i = 1; i < m; i++) {
           for(int j = 1; j< n; j++) {
               dp[i][j] = dp[i-1][j] + dp[i][j-1] + 1;
           }
       }
       
       return dp[m-1][n-1] + 1;
   }
}
