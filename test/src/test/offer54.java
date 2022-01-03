package test;

import test.offer28.TreeNode;

public class offer54 {
	public class TreeNode {
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode(int x) { val = x; }
	}
	int res,num;
	public void dfs(TreeNode root) {
		if(root==null)return;
		if(num==0)return;
		dfs(root.right);
		num--;
		if(num==0)res=root.val;
		dfs(root.left);
		return;
	}
    public int kthLargest(TreeNode root, int k) {
    	this.num=k;
    	dfs(root);
    	return res;
    }
}
