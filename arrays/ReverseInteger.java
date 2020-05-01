package arrays;

public class ReverseInteger {

	/*
	 Given a 32-bit signed integer, reverse digits of an integer.
	 */
	
	public int reverse(int x) {
        int revNum = 0;
        while(x!=0) {
            int digit = x%10;
            x = x/10;
            if (revNum > Integer.MAX_VALUE/10 || (revNum == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (revNum < Integer.MIN_VALUE/10 || (revNum == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            revNum = revNum*10 + digit;
        }
        
        return revNum;
    }
}
