package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class offer32d2 {
	public class TreeNode {
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode(int x) { val = x; }
	}
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	if(root==null) return result;
    	Queue<TreeNode> nodelist=new LinkedList<TreeNode>();
    	nodelist.offer(root);
    	while(!nodelist.isEmpty()) {
        	List<Integer> temp=new ArrayList<Integer>();
        	for(int i=nodelist.size();i>0;i--) {
        		TreeNode node=nodelist.poll();
        		temp.add(node.val);
        		if(node.left!=null)nodelist.offer(node.left);
        		if(node.right!=null)nodelist.offer(node.right);
        	}
        	result.add(temp);
    	}
    	return result;
    }
}
