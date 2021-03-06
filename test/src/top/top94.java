package top;

import java.util.ArrayList;
import java.util.List;

public class top94 {
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
	List<Integer>res=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
    	inorder(root);
    	return res;
    }
    public void inorder(TreeNode root) {
    	if(root==null)return;
    	inorder(root.left);
    	res.add(root.val);
    	inorder(root.right);
    }
}
