package arrays;

public class SingleNumber {

	/*
	 Given a non-empty array of integers, every element appears twice except for one. Find that single one.
	 */
	
	public int singleNumber(int[] nums) {
        var singleNum = nums[0];
        for(int i=1;i<nums.length;i++) {
            singleNum = singleNum^nums[i];
        }
        return singleNum;
    }
}
