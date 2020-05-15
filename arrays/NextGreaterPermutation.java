package arrays;

public class NextGreaterPermutation {

	/*
	 Implement next permutation, which rearranges numbers into the lexicographically next 
	 greater permutation of numbers.
	 If such arrangement is not possible, it must rearrange it as the lowest possible order 
	 (ie, sorted in ascending order).
	 The replacement must be in-place and use only constant extra memory.
	 */
	
	public void nextPermutation(int[] nums) {
        
        int pivot = indexOfFirstPeak(nums) - 1;
        if(pivot != -1) {
            int iFirstRightMostSuccessor = indexOfRightMostSuccessor(nums, nums[pivot]);
            swap(nums, pivot, iFirstRightMostSuccessor);
        }
        
        reverse(nums, pivot + 1);
    }
    
    public int indexOfFirstPeak(int[] nums) {
        
        for(int i = nums.length - 1; i > 0; i--) {
            if(nums[i-1] < nums[i]) return i;
        }
        return 0;
    }
    
    public int indexOfRightMostSuccessor(int[] nums, int pivotValue) {
        for(int i = nums.length -1; i > 0; i--) {
            if(nums[i] > pivotValue) return i;
        }
        
        return -1;
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverse(int[] nums, int start) {
        int end = nums.length -1;
        while(start < end) swap(nums, start++, end--);
    }
}
