package may_challenge;

public class CountingBits {

	/*
	 Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num 
	 calculate the number of 1's in their binary representation and return them as an array.
	 */
	
	public int[] countBits(int num) {
        int[] bits = new int[num + 1];
        
        for(int i = 1; i <= num; i++) {
            bits[i] = bits[i/2];
            if(i%2 == 1) bits[i]++;
        }
        return bits;
    }
}
