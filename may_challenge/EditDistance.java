package may_challenge;

public class EditDistance {

	/*
	 Given two words word1 and word2, find the minimum number of operations required to convert 
	 word1 to word2.

	 You have the following 3 operations permitted on a word:

	 Insert a character
	 Delete a character
	 Replace a character
	 */
	
	public int minDistance(String word1, String word2) {
        if(word1 == null || word2 == null) return -1;
        if (word1.length() == 0) return word2.length();
        if (word2.length() == 0) return word1.length();
        
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        
        int[][] dp = new int[c1.length + 1][c2.length + 1];
        
        for (int i = 0; i <= c1.length; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= c2.length; j++) {
            dp[0][j] = j;
        }
        
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c2.length; j++) {
                if (c1[i] == c2[j]) {
                    dp[i + 1][j + 1] = dp[i][j];
                } else {
                    dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j + 1], dp[i + 1][j]), dp[i][j]) + 1;
                }
            }
        }
        
        return dp[c1.length][c2.length];
    }
}
