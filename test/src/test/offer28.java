package test;


public class offer28 {
	public class TreeNode {
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode(int x) { val = x; }
		}
	public boolean recur(TreeNode left,TreeNode right) {
    	if(left==null&&right==null)return true;
    	if(left==null||right==null||left.val!=right.val)return false;
    	return recur(left.left,right.right)&&recur(left.right,right.left);
    	
    }
    public boolean isSymmetric(TreeNode root) {
    	if(root==null)return true;
    	return recur(root.left,root.right);
    }
}
