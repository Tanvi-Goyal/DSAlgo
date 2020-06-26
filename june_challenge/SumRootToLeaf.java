package june_challenge;

public class SumRootToLeaf {

	/*
	 Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent 
	 a number.

	 An example is the root-to-leaf path 1->2->3 which represents the number 123.

	 Find the total sum of all root-to-leaf numbers.

	 Note: A leaf is a node with no children.
	 */
	
	public int sumNumbers(TreeNode root) {
        return sumNum(root,0);
    }
    
	public int sumNum(TreeNode root, int sum) {
        if (root == null) return 0;
        if (root.right == null && root.left == null) return sum*10 + root.val;
        return sumNum(root.left, sum*10 + root.val) + sumNum(root.right, sum*10 + root.val);
    }
}
