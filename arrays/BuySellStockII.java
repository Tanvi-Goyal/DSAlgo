package arrays;

public class BuySellStockII {

	/*
	 Say you have an array prices for which the ith element is the price of a given stock on day i.
	 Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
	 (i.e., buy one and sell one share of the stock multiple times).
	 
	 Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
	 */
	
	public int maxProfit(int[] prices) {
	       int profit = 0, i = 0;
	        while (i < prices.length) {
	            while (i < prices.length-1 && prices[i+1] <= prices[i]) i++;
	            int min = prices[i++]; 
	            while (i < prices.length-1 && prices[i+1] >= prices[i]) i++;
	            profit += i < prices.length ? prices[i++] - min : 0;
	        }
	    return profit;
	}
}
