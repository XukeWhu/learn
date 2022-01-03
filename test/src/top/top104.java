package top;

import java.util.Deque;
import java.util.LinkedList;

public class top104 {
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
	public int maxDepth(TreeNode root) {
		Deque<TreeNode>dq=new LinkedList<>();
		if(root==null)return 0;
		dq.add(root);
		int deep=0;
		while(!dq.isEmpty()) {
			deep++;
			for(int i=dq.size();i>0;i--) {
				TreeNode temp=dq.poll();
				if(temp.left!=null)dq.add(temp.left);
				if(temp.right!=null)dq.add(temp.right);
			}
		}
		return deep;
    }
}
