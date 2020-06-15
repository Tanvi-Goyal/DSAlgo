package june_challenge;

public class SearchInBST {

	public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val) return root;
        else{
            return val<root.val? searchBST(root.left,val):searchBST(root.right,val);
        }
    }
}
