package arrays;

import java.util.Arrays;

public class MaximumProductOfThree {

	/*
	 Given an integer array, find three numbers whose product is maximum and output the maximum product.
	 */
	
	
	/*
	 all scenarios are listed as following:

	 3 positive -> 3 largest (+)
	 2 positive + 1 negative -> 1 largest (+) 2 smallest (-)
	 1 positive + 2 negative -> 1 largest (+) 2 smallest (-)
	 3 negative -> 3 largest (-)
	 */
	
	public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3] , nums[0]*nums[1]*nums[n-1]);
    }
}
