package may_challenge;

import arrays.MajorityElement;
import arrays.SingleNumber;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Day 1  could not be tested
		
		// Day 2
		JewelsAndStones jewelsAndStones = new JewelsAndStones();
		System.out.println(jewelsAndStones.numJewelsInStones("aA", "aAABBBBBB"));
		
		// Day 3
		RansomNote ransomNote = new RansomNote();
		System.out.println(ransomNote.canConstruct("aa","abb"));
		
		// Day 4
		NumberComplement numberComplement = new NumberComplement();
		System.out.println(numberComplement.findComplement(5));
		
		// Day 5
		FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
		System.out.println(firstUniqueCharacter.firstUniqChar("leetcode"));
		
		// Day 6
		MajorityElement majorityElement = new MajorityElement();
		System.out.println(majorityElement.majorityElement(new int[] {2,2,1,1,1,2,2}));
		
		// Day 7
		CousinsOfBT CousinsOfBT = new CousinsOfBT();
		
		// Day 8
		CheckIfStraightLine checkIfStraightLine = new CheckIfStraightLine();
		System.out.println(checkIfStraightLine.checkStraightLine(new int[][] {
			new int[] {1,1}, new int[] {2,2}, new int[] {3,4}, new int[] {4,5}, new int[] {5,6}, new int[] {7,7}
		}));
		
		// Day 9
		ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
		System.out.println(validPerfectSquare.isPerfectSquare(16));
		
		// Day 10
		FindTownJudge findTownJudge = new FindTownJudge();
		System.out.println(findTownJudge.findJudge(4, new int[][] {
			new int[] {1,3}, new int[] {1,4}, new int[] {2,3}, new int[] {2,4}, new int[] {4,3}
		}));
		
		// Day 11
		FloodFill floodFill = new FloodFill();
		floodFill.floodFill(new int[][] {
			new int[] {1,1,1}, new int[] {1,1,0}, new int[] {1,0,1}
		}, 1, 1, 2);
		
		// Day 12
		SingleNumber singleNum = new SingleNumber();
		System.out.println(singleNum.singleNumber(new int[] {4,1,2,1,2}));
		
		// Day 13
		RemoveKDigits removeKDigits = new RemoveKDigits();
		System.out.println(removeKDigits.removeKdigits("1432219", 3));
		
		// Day 14
		Trie obj = new Trie();
		obj.insert("apple");
		System.out.println(obj.search("apple"));
		System.out.println(obj.startsWith("aps"));
		
		// Day 15
		MaxCircularSubArray maxCircularSubArray = new MaxCircularSubArray();
		System.out.println(maxCircularSubArray.maxSubarraySumCircular(new int[] {3,-1,2,-1}));
		
		// Day 16
		OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
		System.out.println(oddEvenLinkedList.oddEvenList(
				new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))))));
		
		// Day 17
		FindAnagrams findAnagrams = new FindAnagrams();
		System.out.println(findAnagrams.findAnagrams( "cbaebabacd", "abc"));
		
		// Day 18
		PermutationInString permutationInString = new PermutationInString();
		System.out.println(permutationInString.checkInclusion("ab", "eidbaooo"));
		
		// Day 19
		StockSpanner stockSpanner = new StockSpanner();
		int param_1 = stockSpanner.next(75);
		
		// Day 20
		KthSmallestOfBST KthSmallestOfBST = new KthSmallestOfBST();
		System.out.println(KthSmallestOfBST.kthSmallest(
				new TreeNode(3,
						new TreeNode(1, null, new TreeNode(2)),
						new TreeNode(4)
						), 1
				));
		
		// Day 21
		CountSquareSubMatrices countSquareSubMatrices = new CountSquareSubMatrices();
		System.out.println(countSquareSubMatrices.countSquares(new int[][] {
			new int[] {1,1,1}, new int[] {1,1,0}, new int[] {1,0,1}
		}));
		
		// Day 22
		SortByFrequency SortByFrequency = new SortByFrequency();
		System.out.println(SortByFrequency.frequencySort("eEttzsasdscssasaxaxadaaxadww"));
				
	}

	
}
