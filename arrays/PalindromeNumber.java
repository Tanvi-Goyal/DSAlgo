package arrays;

public class PalindromeNumber {

	/*
	 Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
	 */
	
	public boolean isPalindrome(int x) {
        int originalNum = x;
        int revNum = 0;
        if(x<0) return false;
        else {
                while(x!=0) {
                int digit = x%10;
                int result = revNum*10 + digit;
                // checking overflow
                if((result - digit)/10 != revNum) return false;
                revNum = result;
                x/=10;
            }
        }
        
        if(revNum == originalNum) return true;
        return false;
    }
}
