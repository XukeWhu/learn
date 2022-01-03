package top;

import top.top124.TreeNode;

public class top236 {
	TreeNode result=null;
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        if(result!=null)return result;
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(result!=null)return result;
        if((left==q||left==p)||(right==q||right==p)) {
        	if((left==q||left==p)&&(right==q||right==p)) {
        		result=root;
        		return root;
        	}
        	else if(root==q||root==p) {
        		result=root;
        		return root;
        	}
        	else return (left==q||left==p)?left:right;
        }else return root;
    }
}
