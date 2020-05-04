package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum {

	/*
	 Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums 
	 such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
	 Note:
	 The solution set must not contain duplicate quadruplets
	 */
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, 0, 4, target);
    }
    
    public List<List<Integer>> kSum(int[] nums, int start, int k, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // 1. Two Sum Problem
        // 2. Dividing kSum problem as k-1, we have soln for k-1, add 1st element more.
        
        if(k == 2) {
            int left = start;
            int right = nums.length -1;
            
            while(left<right) {
                int sum = nums[left] + nums[right];
                if(sum == target) {
                    List<Integer> subList = new ArrayList<Integer>();
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    result.add(subList);
                    
                    while(left< right && nums[left] == nums[left + 1]) left++;
                    while(left< right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if(sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        } else {
            for(int i=start; i<nums.length - (k-1); i++) {
                if(i>start && nums[i] == nums[i-1]) continue;
                List<List<Integer>> list = kSum(nums, i+1,k-1, target - nums[i]);
                
                for(List<Integer> l : list) {
                    l.add(0, nums[i]);
                }
                
                result.addAll(list);
            }
        }
        return result;
    }
}
