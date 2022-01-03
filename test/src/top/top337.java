package top;

import top.top124.TreeNode;

public class top337 {
	public int rob(TreeNode root) {
		int [] result=robmax(root);
		return Math.max(result[0], result[1]);
    }
	public int [] robmax(TreeNode root) {
		if(root==null)return new int[] {0,0};
		int [] left=robmax(root.left);
		int [] right=robmax(root.right);
		int [] result=new int[2];
		result[0]=Math.max(left[1], right[1])+root.val;
		result[1]=Math.max(left[0], right[0]);
		return result;
    }
}
