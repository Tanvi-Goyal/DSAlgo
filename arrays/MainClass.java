package arrays;

public class MainClass {

	public static void main(String[] args) {
		
		TwoSum twoSum = new TwoSum();
		System.out.print(twoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
		
		SingleNumber singleNum = new SingleNumber();
		System.out.print(singleNum.singleNumber(new int[] {4,1,2,1,2}));
		
		ReverseInteger reverseInteger = new ReverseInteger();
		System.out.print(reverseInteger.reverse(123));
		
		HappyNumber happyNumber = new HappyNumber();
		System.out.print(happyNumber.isHappy(19));
	}

}
