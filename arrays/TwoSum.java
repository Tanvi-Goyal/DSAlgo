package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/*
	 Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 */
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
         throw new IllegalArgumentException("No two sum solution");
	}
}
