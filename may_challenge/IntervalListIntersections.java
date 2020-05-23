package may_challenge;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {

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
