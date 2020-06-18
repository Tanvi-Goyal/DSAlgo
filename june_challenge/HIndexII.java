package june_challenge;

public class HIndexII {

	/*
	 Given an array of citations sorted in ascending order (each citation is a non-negative integer)
	  of a researcher, write a function to compute the researcher's h-index.

	 According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her
	 N papers have at least h citations each, and the other N − h papers have no more than h citations 
	 each."
	 */
	
	public int hIndex(int[] citations) {
        int len = citations.length;
	    int lo = 0, hi = len - 1;
	    while (lo <= hi) {
		    int med = (hi + lo) / 2;
		    if (citations[med] == len - med) {
			    return len - med;
		    } else if (citations[med] < len - med) {
			    lo = med + 1;
		    } else { 
			    hi = med - 1;
		    }
	    }
	    return len - lo;
    }
}
