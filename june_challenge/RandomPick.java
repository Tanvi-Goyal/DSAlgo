package june_challenge;

import java.util.Random;

public class RandomPick {

	/*
	 Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.

	 Note:

	 1 <= w.length <= 10000
	 1 <= w[i] <= 10^5
	 pickIndex will be called at most 10000 times.
	 */
	
	 Random random;
	    int[] wSums;
	    
	    public RandomPick(int[] w) {
	       this.random = new Random();
	        for(int i=1; i<w.length; ++i)
	            w[i] += w[i-1];
	        this.wSums = w;
	    }
	    
	    public int pickIndex() {
	        int len = wSums.length;
	        int idx = random.nextInt(wSums[len-1]) + 1;
	        int left = 0, right = len - 1;
	        // search position 
	        while(left < right){
	            int mid = left + (right-left)/2;
	            if(wSums[mid] == idx)
	                return mid;
	            else if(wSums[mid] < idx)
	                left = mid + 1;
	            else
	                right = mid;
	        }
	        return left;
	    }
	  
	    
}
