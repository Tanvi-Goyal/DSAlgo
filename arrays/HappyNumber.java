package arrays;

public class HappyNumber {

	/*
	 Write an algorithm to determine if a number n is "happy".
	 
	 A happy number is a number defined by the following process: Starting with any positive integer, 
	 replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 
	 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
	 Those numbers for which this process ends in 1 are happy numbers.
	 
	 Return True if n is a happy number, and False if not.
	 */
	
	public boolean isHappy(int n) {
        while(n!=1 && n!=4) {
            n = getSumOfSquare(n);
        }
        if(n == 1)
         return true;
        else return false;
    }
    
    public int getSumOfSquare(int num) {
        int newNum = 0;
        while(num!=0) {
            int digit = num%10;
            num = num/10;
            newNum = newNum + (digit*digit);
        }
        return newNum;
    }
}
