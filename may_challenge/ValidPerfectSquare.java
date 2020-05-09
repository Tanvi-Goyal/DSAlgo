package may_challenge;

public class ValidPerfectSquare {

	/*
	 Given a positive integer num, write a function which returns True if num is a perfect square else False.
	 */
	
	 public boolean isPerfectSquare(int num) {
		 
//		 // approach 1
//	        double n = Math.sqrt(num);
//	        return((n - Math.floor(n)) == 0);
	        
	     // approach 2
	        int i = 1;
	        while(num >0) {
	        	num-=i;
	        	i+=2;
	        }
	        
	        return num == 0;
	        
	    }
}
