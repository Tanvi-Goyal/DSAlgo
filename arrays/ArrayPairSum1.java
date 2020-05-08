package arrays;

import java.util.Arrays;

public class ArrayPairSum1 {

	/*
	 Given an array of 2n integers, your task is to group these integers into n pairs of integer, 
	 say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
	 */
	
	public int arrayPairSum(int[] nums) {
        
        int result = 0;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i+=2) {
            result+=nums[i];
        }
        return result;
    }
}
