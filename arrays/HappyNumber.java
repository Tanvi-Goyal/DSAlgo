package arrays;

public class HappyNumber {

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
