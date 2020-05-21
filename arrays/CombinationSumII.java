package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	/*
	 Given a collection of candidate numbers (candidates) and a target number (target),
	 find all unique combinations in candidates where the candidate numbers sums to target.

	 Each number in candidates may only be used once in the combination.

	 Note:

	 All numbers (including target) will be positive integers.
	 The solution set must not contain duplicate combinations.
	 */
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
                if( i> start && candidates[i] == candidates[i-1]) continue;
                tempList.add(candidates[i]);
                backTrack(list, tempList, candidates, target - candidates[i], i+1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
