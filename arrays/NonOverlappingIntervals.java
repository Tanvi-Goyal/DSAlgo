package arrays;

import java.util.Arrays;

public class NonOverlappingIntervals {

	/*
	 Given a collection of intervals, find the minimum number of intervals you need to 
	 remove to make the rest of the intervals non-overlapping.
	 */
	
	public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        int k = 0;

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[1], i2[1]));
        
        for(int i = 1; i < intervals.length; i++) {
        	if(intervals[i][0] >= intervals[k][1]) {
        		k = i;
        	} else {
        		count++;
        	}
        }
        
        return count;
    }
}
