package test;

import test.offer26.TreeNode;

public class offer55 {
    public boolean isBalanced(TreeNode root) {
    	if(root==null)return true;
    	int left=getlength(root.left),right=getlength(root.right);
    	if(left==right||left==right+1||left==right-1)return isBalanced(root.left)&&isBalanced(root.right);
    	return false;
    }
    public int getlength(TreeNode root) {
    	if(root==null)return 0;
    	return Math.max(getlength(root.left), getlength(root.right))+1;
    }
}
