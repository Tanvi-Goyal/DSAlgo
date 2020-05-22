package arrays;

public class FaLPosOfElement {

	/*
	 Given an array of integers nums sorted in ascending order, find the starting and 
	 ending position of a given target value.

	 Your algorithm's runtime complexity must be in the order of O(log n).

	 If the target is not found in the array, return [-1, -1].
	 */
	
	public int[] searchRange(int[] nums, int target) {
		
        int first = binarySearch(nums, 0, nums.length -1, -1, true, target);
        int last = binarySearch(nums, 0, nums.length -1, -1, false, target);
        return new int[]{first, last};
    }

	private int binarySearch(int[] nums, int start, int end, int lastSeen, boolean first, int target) {
		
		if(start > end) return lastSeen;
		
		int mid = (start + end ) / 2;
		
		if(nums[mid] == target) lastSeen = mid;
		if(nums[mid] > target || (first && nums[mid] == target)) {
			return binarySearch(nums, start, mid-1, lastSeen, first, target);
		} else {
			return binarySearch(nums, mid+1, end, lastSeen, first, target);
		}
	}
}
