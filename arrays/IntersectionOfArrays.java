package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfArrays {
	
	/*
	 Given two arrays, write a function to compute their intersection.
	 */
	
	public List<Integer> intersect(int[] nums1, int[] nums2) {
		
		if(nums1 == null || nums2 == null) return new ArrayList<Integer>();
		
		List<Integer> res = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int n : nums1) {
			map.put(n, map.getOrDefault(n,0) + 1);
		}
		
		for(int n : nums2) {
			if(map.containsKey(n) && map.get(n) > 0) {
				res.add(n);
				map.put(n, map.getOrDefault(n,0) - 1);
			}
		}
		
		return res;
	}
}
