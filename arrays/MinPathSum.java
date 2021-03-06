package arrays;

public class MinPathSum {

	/*
	 Given a m x n grid filled with non-negative numbers, 
	 find a path from top left to bottom right which minimizes the sum of all numbers along its path.

	 Note: You can only move either down or right at any point in time.
	 */
	
	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		
		for(int i = 0; i < m;i++) {
			for(int j = 0;j<n; j++) {
				if(i == 0 && j == 0) {
					grid[i][j] = grid[i][j];
				} else if(i == 0 && j != 0) {
					grid[i][j] = grid[i][j-1] + grid[i][j];
				} else if(j == 0 && i != 0) {
					grid[i][j] = grid[i-1][j] + grid[i][j];
				} else {
					grid[i][j] = Math.min(grid[i][j-1], grid[i-1][j] ) + grid[i][j];
				}
 			}
		}
		return grid[m-1][n-1];
	}
}
