package arrays;

public class MoveZeroes {

	/*
	 Given an array nums, write a function to move all 0's to the end of it 
	 while maintaining the relative order of the non-zero elements.
	 */
	
	public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] !=0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
