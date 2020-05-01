package arrays;

public class FindNumWEvenNOfDigits {

	/*
	 Given an array nums of integers, return how many of them contain an even number of digits.
	 */
	
	public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums) {
            int digitCount = getDigitCount(num);
            if(digitCount % 2 == 0) count++;
        }
        return count;
    }
    
    public int getDigitCount(int num) {
        int digitCount = 0;
        while(num > 0) {
            digitCount++;
            num/=10;
        }
        return digitCount;
    }
}
