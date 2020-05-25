package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	/*
	 Given a collection of intervals, merge all overlapping intervals.
	 */
	
	public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals; 
        List<int[]> res = new ArrayList<>();
        
        Arrays.sort(intervals, (i1,i2) -> Integer.compare(i1[0], i2[0]));
        int[] newInterval = intervals[0];
        res.add(newInterval);
        
        for(int[] currentInterval : intervals) {
        	if(currentInterval[0] <= newInterval[1]) {
        		newInterval[1] = Math.max(currentInterval[1], newInterval[1]);
        	} else {
        		newInterval = currentInterval;
        		res.add(newInterval);
        	}
        }
        return res.toArray(new int[res.size()][]);
    }
	
}
