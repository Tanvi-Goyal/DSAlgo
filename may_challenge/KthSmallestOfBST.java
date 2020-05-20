package may_challenge;

public class KthSmallestOfBST {

	private static int number = 0;
	private static int count = 0;
	
	public int kthSmallest(TreeNode root, int k) {
	   count = k;
	   helper(root);
	   return number;
	}
	    
	private void helper(TreeNode node) {
	   if(node.left != null) helper(node.left);
	   count--;
	        
	   if(count == 0) {
	      number = node.val;
	      return;
	   }
	        
	   if(node.right != null) helper(node.right);
	}
}
