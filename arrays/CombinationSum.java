package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	/*
	 Given a set of candidate numbers (candidates) (without duplicates) and a target number 
	 (target), find all unique combinations in candidates where the candidate numbers sums to target.

	 The same repeated number may be chosen from candidates unlimited number of times.

	 Note:

	 All numbers (including target) will be positive integers.
T	 he solution set must not contain duplicate combinations.
	 */
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backTrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int target, int start) {
        if(target < 0) return;
        else if(target == 0) list.add(new ArrayList<Integer>(tempList));
        else {
            for(int i = start; i < candidates.length ;i++) {
                tempList.add(candidates[i]);
                backTrack(list, tempList, candidates, target - candidates[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
