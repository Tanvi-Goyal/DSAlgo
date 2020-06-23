package june_challenge;

public class CountCompleteTreeNodes {

	/*
	 Given a complete binary tree, count the number of nodes.

	 Note:

	 Definition of a complete binary tree from Wikipedia:
	 In a complete binary tree every level, except possibly the last, is completely filled,
	 and all nodes in the last level are as far left as possible. It can have between 1 and 2h 
	 nodes inclusive at the last level h.
	 */
	
	public int countNodes(TreeNode root) {
        if(root == null) return 0;
        
        TreeNode left = root, right = root;
        int h_l = 0, h_r = 0;
        
        while(left != null) {
            h_l++;
            left = left.left;
        }
        
        while(right != null) {
            h_r++;
            right = right.right;
        }
        
        if(h_l == h_r) return (1<<h_l) - 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
