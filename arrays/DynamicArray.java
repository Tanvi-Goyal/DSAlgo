package arrays;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
	    // Write your code here
		
		int lastAnswer = 0;
		List<Integer> s0 = new ArrayList<>();
		List<Integer> s1 = new ArrayList<>();
		
		List<Integer> res = new ArrayList<>();
		
	    for(int i = 0 ; i < queries.size(); i++) {
	    	List<Integer> query = queries.get(i);
	    	
	    	int queryType = query.get(0);
	    	int x = query.get(1);
	    	int y = query.get(2);
	    	
	    	if(queryType == 1) {
	    		
	    		int seq = (x^lastAnswer) % n;
	    		if(seq == 0) {
	    			s0.add(y);
	    		} else {
	    			s1.add(y);
	    		}
	    		
	    		lastAnswer = 0;
	    	} else if(queryType == 2){
	    		int seq = (x^lastAnswer) % n;
	    		int val;
	    		if(seq == 0) {
	    			val = y % s0.size();
	    			lastAnswer = s0.get(val);
		    		res.add(lastAnswer);

	    		} else {
	    			val = y % s1.size();
	    			lastAnswer = s1.get(val);
	    			res.add(lastAnswer);
	    		}
	    	}
	    }
	    
	    return res;
	}
}
