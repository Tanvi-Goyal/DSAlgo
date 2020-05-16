package arrays;

public class SearchInRotatedArray {

	/*
	 Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).
	 */
	
	public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length -1;
        
        while(lo < hi) {
            int mid = (lo + hi) / 2;
            if(nums[mid] > nums[hi]) lo = mid +1;
            else hi = mid;
        }
        
        int rotatedPoint = lo;
        lo = 0;
        hi = nums.length -1;
        
        while(lo <= hi) {
            int mid = (lo + hi) /2;
            int realMid = (rotatedPoint+ mid) % nums.length;
            
            if(nums[realMid] == target) return realMid;
            else if(nums[realMid] < target) lo = mid +1;
            else hi = mid -1;
        }
        
        return -1;
    }
}
