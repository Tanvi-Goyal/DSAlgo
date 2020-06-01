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
	}

}
