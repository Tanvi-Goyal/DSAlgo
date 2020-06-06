package june_challenge;

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
	}

}
