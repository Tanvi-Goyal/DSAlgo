package arrays;

import java.util.Arrays;

public class ThreeSumClosest {

	/*
	 Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target.
	 Return the sum of the three integers. You may assume that each input would have exactly one solution.
	 */
	
	public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length -1];
        Arrays.sort(nums);
        
        for(int i=0;i+2<nums.length;i++) {
            int j = i+1;
            int k = nums.length -1;
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<=target) j++;
                else k--;
                
                if(Math.abs(sum - target) < Math.abs(result - target)) result = sum;
            }
        }
        return result;
    }
}
