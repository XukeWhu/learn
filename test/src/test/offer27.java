package test;

public class offer27 {
	public class TreeNode {
	   int val;
	   TreeNode left;
	   TreeNode right;
	   TreeNode(int x) { val = x; }
	}
	public void change(TreeNode root) {
		if(root==null)return;
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		change(root.left);
		change(root.right);
	}
    public TreeNode mirrorTree(TreeNode root) {
    	change(root);
    	return root;
    }
}
