package arrays;

public class SearchInRotatedArrayII {

	/*
	 Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
	 (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
	 
	 You are given a target value to search. If found in the array return true, otherwise return false.
	 */
	
	public boolean search(int[] nums, int target) {
	      int i = 0, j = nums.length - 1;
	        while(i <= j) {
	            int m = (i + j) / 2;
	            if(nums[m] == target) return true;
	            if(nums[m] == nums[i]) i++;   //"duplicate", jump
	            else if(nums[m] > nums[i]) {
	                if(nums[m] > target && nums[i] <= target) j = m - 1; 
	                else i = m + 1;
	            } else {
	                if(nums[m] < target && nums[j] >= target) i = m + 1;
	                else j = m - 1;
	            }
	        }
	        return false;
	    }
}
