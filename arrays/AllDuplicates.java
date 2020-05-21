package arrays;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {

	/*
	 Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear 
	 twice and others appear once.

	 Find all the elements that appear twice in this array.

	 Could you do it without extra space and in O(n) runtime?
	 */
	
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++) {
            while(nums[i] != i+1 && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            }
        }
        
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != i+1) res.add(nums[i]);
        }
        
        return res;
    }
}
