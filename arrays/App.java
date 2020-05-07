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
		
		CheckIfNandDoubleExist checkIfNandDoubleExist = new CheckIfNandDoubleExist();
		System.out.println(checkIfNandDoubleExist.checkIfExist(new int[] {10,2,5,3}));
		
		ValidMountainArray validMountainArray = new ValidMountainArray();
		System.out.println(validMountainArray.validMountainArray(new int[] {3,5,5}));
		
		ReplaceWGreatestOnRight replaceWGreatestOnRight = new ReplaceWGreatestOnRight();
		System.out.println(replaceWGreatestOnRight.replaceElements(new int[] {17,18,5,4,6,1}));
		
		SortArrayByParity sortArrayByParity = new SortArrayByParity();
		System.out.println(sortArrayByParity.sortArrayByParity(new int[] {3,1,2,4}));
		
		HeightChecker heightChecker = new HeightChecker();
		System.out.println(heightChecker.heightChecker(new int[] {1,1,4,2,1,3}));
		
		ThirdMaxNumber thirdMaxNumber = new ThirdMaxNumber();
		System.out.println(thirdMaxNumber.thirdMax(new int[] {2, 2, 3, 1}));
		
		FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers();
		System.out.println(findDisappearedNumbers.findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
		
		SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
		System.out.println(searchInsertPosition.searchInsert(new int[] {1,3,5,6}, 7));
		
		PlusOne plusOne = new PlusOne();
		System.out.println(plusOne.plusOne(new int[] {4,3,2,1}));
		
		PasCalTraingle pasCalTraingle = new PasCalTraingle();
		System.out.println(pasCalTraingle.generate(5));
		
		PascalTraingleII pascalTraingleII = new PascalTraingleII();
		System.out.println(pascalTraingleII.getRow(3));
		
		BuySellStock buySellStock = new BuySellStock();
		System.out.println(buySellStock.maxProfit(new int[] {7,1,5,3,6,4}));
		
		TwoSumII twoSumII = new TwoSumII();
		System.out.println(twoSumII.twoSum(new int[] {2,7,11,15}, 9));
		
		MajorityElement majorityElement = new MajorityElement();
		System.out.println(majorityElement.majorityElement(new int[] {2,2,1,1,1,2,2}));
		
		RotateArray rotateArray = new RotateArray();
		rotateArray.rotate(new int[] {1,2,3,4,5,6,7},3);
		
		ContainsDuplicate containsDuplicate = new ContainsDuplicate();
		System.out.println(containsDuplicate.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
		
		ContainsDuplicateII ContainsDuplicateII = new ContainsDuplicateII();
		System.out.println(ContainsDuplicateII.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
		
		FibonnaciNumber fibonnaciNumber = new FibonnaciNumber();
		System.out.println(fibonnaciNumber.fib(3));
		
		ClimbingStairs climbingStairs = new ClimbingStairs();
		System.out.println(climbingStairs.climbStairs(4));
		
		MostWater mostWater = new MostWater();
		System.out.println(mostWater.maxArea(new int[] {3,9,3,4,7,2,12,6}));
		
		ThreeSum threeSum = new ThreeSum();
		threeSum.threeSum(new int[] {-1, 0 , 1, 2, -1, -4});
		
		ThreeSumClosest threeSumClosest = new ThreeSumClosest();
		System.out.println(threeSumClosest.threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
		
		KSum kSum = new KSum();
		System.out.println(kSum.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0));
		
		ArrayNesting arrayNesting = new ArrayNesting();
		System.out.println(arrayNesting.arrayNesting(new int[] {5,4,0,3,1,6,2}));
		
		KDiff kDiff = new KDiff();
		System.out.println(kDiff.findPairs(new int[] {3,1,4,1,5}, 2));
		
	}

}
