package arrays;

public class MaxAvgSubArray {

	/*
	 Given an array consisting of n integers, find the contiguous subarray of given length k 
	 that has the maximum average value. And you need to output the maximum average value.
	 */
	
	public double findMaxAverage(int[] nums, int k) {
		
      int max = Integer.MIN_VALUE;
      int sum = 0;
      for(int i=0;i< nums.length;i++) {
          sum+=nums[i];
          
          if(i>= k) {
              sum-=nums[i-k];
          }
          if(i >= k-1) {
              max = Math.max(max, sum);
          }
      }
      return (double) max/k;
  }
}
