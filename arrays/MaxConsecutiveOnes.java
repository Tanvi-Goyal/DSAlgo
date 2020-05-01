package arrays;

public class MaxConsecutiveOnes {
	
	/*
	 Given a binary array, find the maximum number of consecutive 1s in this array.
	 */
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentMax = 0;
        for(int num: nums) {
            if(num == 0) {
                currentMax = 0;
            } else {
                currentMax++;
                max = Math.max(max, currentMax);
            }
        }
        return max;
    }
}
