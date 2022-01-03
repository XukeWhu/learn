package top;

import top.top114.TreeNode;

public class top124 {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	        this.right = right;
	     }
	}
	int max=Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
		maxG(root);
		return max;
    }
	public int maxG(TreeNode root) {
		if(root==null)return 0;
		int left=Math.max(0, maxG(root.left));
		int right=Math.max(0, maxG(root.right));
		int maxcur=left+right+root.val;
		max=Math.max(max, maxcur);
		return root.val+Math.max(left,right);
    }
}
