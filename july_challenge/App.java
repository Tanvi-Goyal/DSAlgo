package july_challenge;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Day 1
		ArrangeCoins arrangeCoins = new ArrangeCoins();
		System.out.println(arrangeCoins.arrangeCoins(5));
		
		// Day 2
		BTLevelOrder BTLevelOrder = new BTLevelOrder();
		System.out.println(BTLevelOrder.levelOrderBottom(
				new TreeNode(3, 
						new TreeNode(9),
						new TreeNode(20,
								new TreeNode(15),
								new TreeNode(7)
								)
						)));
	}

}
