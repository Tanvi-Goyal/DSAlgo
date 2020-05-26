package may_challenge;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

	/*
	 Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
	 */
	
	public int findMaxLength(int[] nums) {
        for(int i = 0; i <nums.length; i++) {
            if(nums[i] == 0) nums[i] = -1;
        }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int max = 0;
        map.put(0,-1);
        
        for(int i = 0; i < nums.length ; i++) {
            sum += nums[i];
            
            if(map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
