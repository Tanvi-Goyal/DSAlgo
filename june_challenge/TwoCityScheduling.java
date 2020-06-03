package june_challenge;

public class TwoCityScheduling {

	/*
	 There are 2N people a company is planning to interview. 
	 The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th 
	 person to city B is costs[i][1].

	 Return the minimum cost to fly every person to a city such that exactly N 
	 people arrive in each city.
	 */
	
	public int twoCitySchedCost(int[][] costs) {
        int N = costs.length / 2;
        int[][] dp = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            dp[i][0] = dp[i - 1][0] + costs[i - 1][0];
        }
        for (int j = 1; j <= N; j++) {
            dp[0][j] = dp[0][j - 1] + costs[j - 1][1];
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = Math.min(dp[i-1][j] + costs[i+j-1][0], dp[i][j-1] + costs[i+j-1][1]);
            }
        }
        return dp[N][N];
    }
}
