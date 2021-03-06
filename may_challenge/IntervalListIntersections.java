package may_challenge;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {

	/*
	 Given two lists of closed intervals, each list of intervals is pairwise disjoint 
	 and in sorted order.
	 Return the intersection of these two interval lists.

	 (Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x 
	 with a <= x <= b.  The intersection of two closed intervals is a set of real numbers 
	 that is either empty, or can be represented as a closed interval.  For example,
	  the intersection of [1, 3] and [2, 4] is [2, 3].)

 
	 */
	public int[][] intervalIntersection(int[][] A, int[][] B) {
        
        List<int[]> res = new ArrayList();
        
        int i = 0;
        int j = 0;
        int startMax, endMin;
        
        while(i < A.length && j < B.length) {
        	startMax = Math.max(A[i][0], B[j][0]);
        	endMin = Math.min(A[i][1], B[j][1]);
        	
        	if(endMin >= startMax) res.add(new int[] {startMax, endMin});
        	
        	if(A[i][1] == endMin) i++;
        	if(B[j][1] == endMin) j++;
        }
        return res.toArray(new int[res.size()][2]);
        
    }
}
