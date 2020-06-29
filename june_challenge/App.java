package june_challenge;

import java.util.ArrayList;
import java.util.List;

import arrays.UniquePaths;

public class App {

	public static void main(String[] args) {

		// `Day 1
		InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
		System.out.println(invertBinaryTree.invertTree(
				new TreeNode(4, 
						new TreeNode(2,
								new TreeNode(1),
								new TreeNode(3)),
						new TreeNode(7,
								new TreeNode(6),
								new TreeNode(9)
								)
						)
				)
			);
		
		// Day 2
		DeleteNode deleteNode = new DeleteNode();
	
		// Day 3
		TwoCityScheduling twoCityScheduling = new TwoCityScheduling();
		System.out.println(twoCityScheduling.twoCitySchedCost(new int[][] {
			new int[] {10,20}, new int[] {30,200}, new int[] {400,50}, new int[] {30,20}
		}));
		
		// Day 4
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.reverseString(new char[] {'h','e','l','l','o'}));
		
		// Day 5
//		 RandomPick obj = new RandomPick(new int[] {"Solution","pickIndex"});
//		 int param_1 = obj.pickIndex();
		
		// June 6
		QueueReconstruction queueReconstruction = new QueueReconstruction();
		
		// June 7
		CoinChange coinChange = new CoinChange();
		System.out.println(coinChange.change(5, new int[] {1,2,5}));
		
		// June 8
		PowerOfTwo powerOfTwo = new PowerOfTwo();
		System.out.println(powerOfTwo.isPowerOfTwo(216));
		
		// June 9
		isSubsequenceString isSubsequenceString = new isSubsequenceString();
		System.out.println(isSubsequenceString.isSubsequence("aec", "abcde"));
		
		// June 10
		SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
		System.out.println(searchInsertPosition.searchInsert(new int[] {1,3,5,6}, 5));
		
		// June 11
		SortColors SortColors = new SortColors();
		
		// June 12
//		RandomizedSet obj = new RandomizedSet();
//		System.out.println(obj.insert(2));
//		System.out.println(obj.remove(2));
//		System.out.println(obj.getRandom());
//		
		// June 13
		LargestDivisibleSubset largestDivisibleSubset = new LargestDivisibleSubset();
		System.out.println(largestDivisibleSubset.largestDivisibleSubset(new int[] {1,2,4,8}));
		
		// June 14
		CheapestFlightKStops cheapestFlightKStops = new CheapestFlightKStops();
		System.out.println(cheapestFlightKStops.findCheapestPrice(3, new int[][] {
			new int[] {0,1,100}, new int[] {1,2,100}, new int[] {0,2,500}
 		}, 0, 2, 0));
		
		// June 15
		SearchInBST searchInBST = new SearchInBST();
		
		// June 16
		ValidateIpAddress validateIpAddress = new ValidateIpAddress();
		System.out.println(validateIpAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
		
		// June 17
		SurroundedRegions surroundedRegions = new SurroundedRegions();
		
		// June 18
		HIndexII hIndexII = new HIndexII();
		System.out.println(hIndexII.hIndex(new int[] {0,1,3,5,6}));
		
		// June 19
		LongestDuplicateSubstring longestDuplicateSubstring = new LongestDuplicateSubstring();
		System.out.println(longestDuplicateSubstring.longestDupSubstring("banana"));
		
		// June 20
		PermutationSequence permutationSequence = new PermutationSequence();
		System.out.println(permutationSequence.getPermutation(4, 9));
		
		// June 21
		DungeonGame dungeonGame = new DungeonGame();
		System.out.println(dungeonGame.calculateMinimumHP(new int[][] {
			new int[] {-2,-3,3}, new int[] {-5,-10,1}, new int[] {10,30,-5}
		}));
		
		// June 22
		SingleNumII singleNumII = new SingleNumII();
		System.out.println(singleNumII.singleNumber(new int[] {0,1,0,1,0,1,99}));
		
		// June 23
		CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();
		System.out.println(countCompleteTreeNodes.countNodes(new TreeNode(4, 
				new TreeNode(2,
						new TreeNode(1),
						new TreeNode(3)),
				new TreeNode(7,
						new TreeNode(6),
						new TreeNode(9)
						)
				)
		));
		
		// June 24
		UinqueBinarySearchTree uinqueBinarySearchTree = new UinqueBinarySearchTree();
		System.out.println(uinqueBinarySearchTree.numTrees(3));
		
		// June 25
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		System.out.println(duplicateNumber.findDuplicate(new int[] {1,3,4,2,2}));
		
		// June 26
		SumRootToLeaf sumRootToLeaf = new SumRootToLeaf();
		System.out.println(sumRootToLeaf.sumNumbers(
				new TreeNode(4,
						new TreeNode(9,
								new TreeNode(5),
								new TreeNode(1)),
						new TreeNode(0)
						)
				)
		);
		
		// June 27
		PerfectSquares perfectSquares = new PerfectSquares();
		System.out.println(perfectSquares.numSquares(12));
		
		// June 28
		List<List<String>> tickets = new ArrayList<List<String>>();
		tickets.add(new ArrayList<String>() {{
		    add("MUC");
		    add("LHR");
		}});
		tickets.add(new ArrayList<String>() {{
		    add("JFK");
		    add("MUC");
		}});
		tickets.add(new ArrayList<String>() {{
		    add("SFO");
		    add("SJC");
		}});
		tickets.add(new ArrayList<String>() {{
		    add("LHR");
		    add("SFO");
		}});

		Reconstructitineary reconstructitineary = new Reconstructitineary();
		System.out.println(reconstructitineary.findItinerary(tickets));
		
		UniquePaths uniquePaths = new UniquePaths();
		System.out.println(uniquePaths.uniquePaths(3, 2));
	}

}
