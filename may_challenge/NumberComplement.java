package may_challenge;

public class NumberComplement {

	/*
	 Given a positive integer, output its complement number. The complement strategy is to flip the 
	 bits of its binary representation.
	 */
	
	public int findComplement(int num) {
        int x = 1;
        while(num > x) x = x*2 + 1;
        return x-num;
    }
}
