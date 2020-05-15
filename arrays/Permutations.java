package arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	/*
	 Given a collection of distinct integers, return all possible permutations.
	 */
	
	 public List<List<Integer>> permute(int[] nums) {
	        
	        if(nums.length == 0) {
	            List<List<Integer>> res = new ArrayList<List<Integer>>();
	            List<Integer> list = new ArrayList<>();
	            res.add(list);
	            return res;
	        }
	        
	        int currentVal = nums[0];
	        int[] subArray = new int[nums.length - 1];
	        for(int i=1;i< nums.length;i++) {
	            subArray[i-1] = nums[i];
	        }
	        
	        List<List<Integer>> subRes = permute(subArray);
	        List<List<Integer>> ans = new ArrayList<List<Integer>>();
	        
	        for(int i=0; i < subRes.size();i++) {
	        	
	            List<Integer> permutation = subRes.get(i);     
	            for(int j = 0;j < permutation.size(); j++) {
	            	
		            List<Integer> newList = new ArrayList<Integer>();     
		            newList.addAll(permutation);
		            newList.add(j, currentVal);
	            	ans.add(newList);
				}
	            
	            List<Integer> newList = new ArrayList<Integer>();     
	            newList.addAll(permutation);
	            newList.add(currentVal);
            	ans.add(newList);
	            
	        }
	        
	        return ans;
	    }
}
