package arrays;

public class UnsortedSubarray {

	/*
	 Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
	 then the whole array will be sorted in ascending order, too.
	 You need to find the shortest such subarray and output its length.
	 */
	
	public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return 0;
        
        int max = Integer.MIN_VALUE;
        int endIndex = -2;
        for(int i =0;i <nums.length;i++) {
            max = Math.max(max, nums[i]);
            if(nums[i] < max) {
                endIndex = i;
            }
        }
        
        int min = Integer.MAX_VALUE;
        int beginIndex = -1;
        
        for(int i= nums.length -1; i>=0 ;i--) {
            min = Math.min(min, nums[i]);
            if(nums[i] > min) {
                beginIndex = i;
            }
        }
        
        return endIndex - beginIndex + 1;
    }
}
