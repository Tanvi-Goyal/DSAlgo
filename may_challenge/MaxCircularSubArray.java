package may_challenge;

public class MaxCircularSubArray {

	/*
	 Given a circular array C of integers represented by A, find the maximum possible 
	 sum of a non-empty subarray of C.
	 
	 Here, a circular array means the end of the array connects to the beginning of the array.  
	 (Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)
	 
	 Also, a subarray may only include each element of the fixed buffer A at most once.
	 (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i <= k1, k2 <= j 
	 with k1 % A.length = k2 % A.length.)
	 */
	
	/*
	 EXPLANATION - 
	 
	 The first is that the subarray take only a middle part, and we know how to find the max subarray sum
	 .
	 The second is that the subarray take a part of head array and a part of tail array.
	 We can transfer this case to the first one.
	 The maximum result equals to the total sum minus the minimum subarray sum.
	 */
	
	public int maxSubarraySumCircular(int[] A) {
        
        int total = 0, maxSum = -30000, curMax = 0, minSum = 30000, curMin = 0;
        
        for(int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total+=a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}
