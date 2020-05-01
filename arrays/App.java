package arrays;

public class App {

	public static void main(String[] args) {
		
		TwoSum twoSum = new TwoSum();
		System.out.println(twoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
		
		SingleNumber singleNum = new SingleNumber();
		System.out.println(singleNum.singleNumber(new int[] {4,1,2,1,2}));
		
		ReverseInteger reverseInteger = new ReverseInteger();
		System.out.println(reverseInteger.reverse(123));
		
		HappyNumber happyNumber = new HappyNumber();
		System.out.println(happyNumber.isHappy(19));
		
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		System.out.println(palindromeNumber.isPalindrome(121));
		
		MaximumSubArray maxSubArray = new MaximumSubArray();
		System.out.println(maxSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		
		MoveZeroes moveZeroes = new MoveZeroes();
		moveZeroes.moveZeroes(new int[] {0,1,0,3,12});
		
		BuySellStockII buySell = new BuySellStockII();
		System.out.println(buySell.maxProfit(new int[] {7,1,5,3,6,4}));
		
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		System.out.println(removeDuplicates.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
		
		MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
		System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
		
		FindNumWEvenNOfDigits findNumWEvenNOfDigits = new FindNumWEvenNOfDigits();
		System.out.println(findNumWEvenNOfDigits.findNumbers(new int[] {12,345,2,6,7896}));
		
		SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
		System.out.println(squaresOfSortedArray.sortedSquares(new int[] {-4,-1,0,3,10}));
		
		DuplicateZeroes duplicateZeroes = new DuplicateZeroes();
		duplicateZeroes.duplicateZeros(new int[] {1,0,2,3,0,4,5,0});
		
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		mergeSortedArray.merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
		
		RemoveElement removeElement = new RemoveElement();
		System.out.println(removeElement.removeElement(new int[] {3,2,2,3}, 3));
		
		CheckIfNandDoubleExist CheckIfNandDoubleExist = new CheckIfNandDoubleExist();
		System.out.println(CheckIfNandDoubleExist.checkIfExist(new int[] {10,2,5,3}));
		
		
	}

}
