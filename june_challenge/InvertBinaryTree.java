package june_challenge;

public class InvertBinaryTree {

	/*
	 Invert a binary tree.
	 */
	
	public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        root.left = right;
        root.right = left;
        return root;
    }
}
