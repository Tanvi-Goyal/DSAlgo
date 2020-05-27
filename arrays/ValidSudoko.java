package arrays;

import java.util.HashSet;

public class ValidSudoko {

	public boolean isValidSudoko(char board[][]) {
		
		/*
		 Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated 
		 according to the following rules:

	 	 Each row must contain the digits 1-9 without repetition.
	  	 Each column must contain the digits 1-9 without repetition.
		 Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

		 */
		
		for(int i = 0; i < 9; i++) {
			HashSet<Character> rows = new HashSet<Character>();
	        HashSet<Character> columns = new HashSet<Character>();
	        HashSet<Character> cube = new HashSet<Character>();
	        
	        for(int  j = 0; j < 9; j++) {
	        	if(board[i][j] !='.' && !rows.add(board[i][j])) return false;
	        	if(board[j][i] !='.' && !columns.add(board[j][i])) return false;
	        	
	        	int rowIndex = 3*(i/3);
	        	int colIndex = 3*(i%3);
	        	
	        	if(board[rowIndex + j/3][colIndex + j%3]!='.' && 
	        			!cube.add(board[rowIndex + j/3][colIndex + j%3])) return false; 
	        }
		}
		return true;
	}
}
