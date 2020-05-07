package may_challenge;

public class CousinsOfBT {

	/*
	 In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
	 Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
	 We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
	 Return true if and only if the nodes corresponding to the values x and y are c
	 */
	
	TreeNode xParent = null;
    TreeNode yParent = null;
    int xDepth = -1, yDepth = -1;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        getDepthAndParent(root, x, y, 0, null);
        return xDepth == yDepth && xParent != yParent? true: false;
    }
    
    public void getDepthAndParent(TreeNode root, int x, int y, int depth, TreeNode parent){
        if(root == null){
            return;
        }
        if(root.val == x){
            xParent = parent;
            xDepth = depth;
        }else if(root.val == y){
            yParent = parent;
            yDepth = depth;
        }       
        getDepthAndParent(root.left, x, y, depth + 1, root);
        getDepthAndParent(root.right, x, y, depth + 1, root);
    }
}
