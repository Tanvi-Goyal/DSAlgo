package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	/*
	 Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
	 Find all unique triplets in the array which gives the sum of zero.
	 Note:
	 The solution set must not contain duplicate triplets.
	 */
	
	public List<List<Integer>> threeSum(int[] nums) {
	    List<List<Integer>> res = new ArrayList<>();
	    Arrays.sort(nums);
	    for (int i = 0; i + 2 < nums.length; i++) {
	        if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
	            continue;
	        }
	        int j = i + 1, k = nums.length - 1;  
	        int target = -nums[i];
	        while (j < k) {
	            if (nums[j] + nums[k] == target) {
	                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                j++;
	                k--;
	                while (j < k && nums[j] == nums[j - 1]) j++; 
	                while (j < k && nums[k] == nums[k + 1]) k--;  
	            } else if (nums[j] + nums[k] > target) {
	                k--;
	            } else {
	                j++;
	            }
	        }
	    }
	    return res;
	}
}
