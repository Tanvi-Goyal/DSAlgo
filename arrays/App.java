package arrays;

import java.util.ArrayList;
import java.util.List;

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
		
		ArrayPairSum1 arrayPairSum1 = new ArrayPairSum1();
		System.out.println(arrayPairSum1.arrayPairSum(new int[] {1,2,3,4}));
		
		ReshapeMatrix reshapeMatrix = new ReshapeMatrix();
		
		UnsortedSubarray unsortedSubarray = new UnsortedSubarray();
		System.out.println(unsortedSubarray.findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15}));
		
		CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
		System.out.println(canPlaceFlowers.canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
		
		MaximumProductOfThree maximumProductOfThree = new MaximumProductOfThree();
		System.out.println(maximumProductOfThree.maximumProduct(new int[] {1,2,3,4}));
		
		MaxAvgSubArray maxAvgSubArray = new MaxAvgSubArray();
		System.out.println(maxAvgSubArray.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
		
		ToeplitzMatrix ToeplitzMatrix = new ToeplitzMatrix();
		System.out.println(ToeplitzMatrix.isToeplitzMatrix(new int[][] {
			new int[] {1,2,3,4}, new int[] {5,1,2,3}, new int[] {9,5,1,2}
		}));
		
		NextGreaterPermutation nextGreaterPermutation = new NextGreaterPermutation();
		
		Permutations permutations = new Permutations();
		System.out.println(permutations.permute(new int[] {1,2,3}));
		
		SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
		System.out.println(searchInRotatedArray.search(new int[] {4,5,6,7,0,1,2}, 0));
		
		MinInRotatedArray minInRotatedArray = new MinInRotatedArray();
		System.out.println(minInRotatedArray.findMin(new int[] {4,5,6,7,0,1,2}));
		
		SearchInRotatedArrayII searchInRotatedArrayII = new SearchInRotatedArrayII();
		System.out.println(searchInRotatedArrayII.search(new int[] {4,5,6,7,0,1,2}, 0));
		
		ValidAnagrams validAnagrams = new ValidAnagrams();
		System.out.println(validAnagrams.isAnagram("anagram", "nagaram"));
		
		GroupAnagrams groupAnagrams = new GroupAnagrams();
		System.out.println(groupAnagrams.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
		
		Subsets Subsets = new Subsets();
		System.out.println(Subsets.subsets(new int[] {1,2,3}));
		
		SubsetsII SubsetsII = new SubsetsII();
		System.out.println(SubsetsII.subsets(new int[] {1,2,2}));
		
		CombinationSum combinationSum = new CombinationSum();
		System.out.println(combinationSum.combinationSum(new int[] {2,3,6,7}, 7));
		
		CombinationSumII CombinationSumII = new CombinationSumII();
		System.out.println(CombinationSumII.combinationSum2(new int[] {10,1,2,7,6,1,5}, 8));
		
		AllDuplicates allDuplicates = new AllDuplicates();
		System.out.println(allDuplicates.findDuplicates(new int[] {4,3,2,7,8,2,3,1}));
		
		FaLPosOfElement faLPosOfElement = new FaLPosOfElement();
		int[] res = faLPosOfElement.searchRange(new int[] {5,7,7,8,8,10}, 8);
		System.out.println(res[0] + " " + res[1]);
		
		PermutationsII permutationsII = new PermutationsII();
		System.out.println(permutationsII.permuteUnique(new int[] {1,1,2}));
		
		PalindromePartioning palindromePartioning = new PalindromePartioning();
		System.out.println(palindromePartioning.partition("aab"));
		
		RotateMatrix RotateMatrix = new RotateMatrix();
		
		SpiralMatrix SpiralMatrix = new SpiralMatrix();
		System.out.println(SpiralMatrix.spiralOrder(new int[][] {
			new int[] {1,2,3,4}, new int[] {5,6,7,8}, new int[] {9,10,11,12}
		}));
		
		MergeIntervals mergeIntervals = new MergeIntervals();
		
		NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();
		System.out.println(nonOverlappingIntervals.eraseOverlapIntervals(new int[][] {
			new int[] {1,100}, new int[] {11,22}, new int[] {1,11}, new int [] {2,12}
		}));
		
		MinArrowShots minArrowShots = new MinArrowShots();
		System.out.println(minArrowShots.findMinArrowShots(new int[][] {
			new int[] {10,16}, new int[] {2,8}, new int[] {1,6}, new int [] {7,12}
		}));
		
		IntersectionOfArrays IntersectionOfArrays = new IntersectionOfArrays();
		System.out.println(IntersectionOfArrays.intersect(new int[] {1,2,2,1}, new int[] {2,2}));
		
		ValidSudoko validSudoko = new ValidSudoko();
		System.out.println(validSudoko.isValidSudoko(new char[][] {
			new char[] {'5','3','.','.','7','.','.','.','.'},
			new char[] {'6','.','.','1','9','5','.','.','.'},
			new char[] {'.','9','8','.','.','.','.','6','.'},
			new char[] {'8','.','.','.','6','.','.','.','3'},
			new char[] {'4','.','.','8','.','3','.','.','1'},
			new char[] {'7','.','.','.','2','.','.','.','6'},
			new char[] {'.','6','.','.','.','.','2','8','.'},
			new char[] {'.','.','.','4','1','9','.','.','5'},
			new char[] {'.','.','.','.','8','.','.','7','9'}
		}));
		
		SpiralMatrixII spiralMatrixII = new SpiralMatrixII();
		
		UniquePaths uniquePaths = new UniquePaths();
		System.out.println(uniquePaths.uniquePaths(3, 2));
		
		MinPathSum minPathSum = new MinPathSum();
		System.out.println(minPathSum.minPathSum(new int[][] {
			new int[] {1,3,1}, new int[] {1,5,1}, new int[] {4,2,1}
		}));
		
		
		List<List<Integer>> queries = new ArrayList<List<Integer>>();
		
		queries.add(new ArrayList<Integer>() {{
		    add(1); add(0); add(5);
		}});
		
		queries.add(new ArrayList<Integer>() {{
		    add(1); add(1); add(7);
		}});
		queries.add(new ArrayList<Integer>() {{
		    add(1); add(0); add(3);
		}});
		queries.add(new ArrayList<Integer>() {{
		    add(2); add(1); add(0);
		}});
		queries.add(new ArrayList<Integer>() {{
		    add(2); add(1); add(1);
		}});
		
		DynamicArray da = new DynamicArray();
		System.out.println(da.dynamicArray(2, queries));
	}

}
