package june_challenge;

public class UinqueBinarySearchTree {

	/*
	 Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
	 */
	
	public int numTrees(int n) {
        int [] dp = new int[n+1];
        dp[0]= 1;
        dp[1] = 1;
        for(int level = 2; level <=n; level++)
            for(int root = 1; root<=level; root++)
                dp[level] += dp[level-root]*dp[root-1];
        return dp[n];
    }
}
