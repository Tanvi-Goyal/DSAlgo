package arrays;

public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
        int count = 1 ; 
        int j = 1;
        
        for(int i = 1;i<nums.length;i++) {
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
                count++;
            }
        }
        return count;
    }
}
