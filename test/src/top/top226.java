package top;

import top.top114.TreeNode;

public class top226 {
	public TreeNode invertTree(TreeNode root) {
		if(root==null)return root;
		TreeNode temp=root.left;
		root.left=invertTree(root.right);
		root.right=invertTree(temp);
		return root;
    }
}
