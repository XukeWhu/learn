package top;

import java.util.Deque;
import java.util.LinkedList;

import top.top104.TreeNode;

public class top105 {
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
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int end=preorder.length-1;
		return buildsubTree(preorder,inorder,0,end,0,end);
    }
	public TreeNode buildsubTree(int[] preorder, int[] inorder, int ps,int pe,int is,int ie) {
        if(ps>pe)return null;
		int pval=preorder[ps];
		TreeNode root=new TreeNode(pval);
		int ipoint=is;
		for(int i=is;i<=ie;i++) {
			if(inorder[i]==pval) {
				ipoint=i;
				break;
			}
		}
		int ppoint=ps+ipoint-is;
		root.left=buildsubTree(preorder,inorder,ps+1,ppoint,is,ipoint-1);
		root.right=buildsubTree(preorder,inorder,ppoint+1,pe,ipoint+1,ie);
		return root;
	}
}
