package may_challenge;

public class BSTFromPreOrder {

	/*
	 Return the root node of a binary search tree that matches the given preorder traversal.

	 (Recall that a binary search tree is a binary tree where for every node, any descendant of node.
	 left has a value < node.val, and any descendant of node.right has a value > node.val.  
	 Also recall that a preorder traversal displays the value of the node first, 
	 then traverses node.left, then traverses node.right.)

	 It's guaranteed that for the given test cases there is always possible to find a binary search 
	 tree with the given requirements.
	 */
	
	 int i = 0;
	 public TreeNode bstFromPreorder(int[] preorder) {
	    return helper(preorder, Integer.MAX_VALUE);
	 }
	    
	 public TreeNode helper(int[] preorder, int bound) {
	        
	    if(i == preorder.length || preorder[i] > bound) return null;
	    TreeNode node = new TreeNode(preorder[i++]);
	    node.left = helper(preorder, node.val);
	    node.right = helper(preorder, bound);
	    return node;
	 }
}
