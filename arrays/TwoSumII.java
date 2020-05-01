package arrays;

import java.util.HashMap;

public class TwoSumII {
	
	/*
	 Given an array of integers that is already sorted in ascending order, find two numbers such that they add up 
	 to a specific target number.
	 The function twoSum should return indices of the two numbers such that they add up to the target, 
	 where index1 must be less than index2.
	 
	 Note:
	 Your returned answers (both index1 and index2) are not zero-based.
	 You may assume that each input would have exactly one solution and you may not use the same element twice.
	 */
	
	public int[] twoSum(int[] numbers, int target) {
        
        int[] twoNum = new int[2]; 
        if(numbers.length < 2) return twoNum;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++) {
            if(map.containsKey(target - numbers[i])) {
                twoNum[0] = map.get(target - numbers[i]) + 1;
                twoNum[1] = i+1;
            }
            map.put(numbers[i], i);
        }
        return twoNum;
    }

}
