package arrays;

public class MainClass {

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		
		int[] result = twoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
		System.out.print(result);
	}

}
