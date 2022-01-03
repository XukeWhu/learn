package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class offer32d1 {
	public class TreeNode {
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode(int x) { val = x; }
	}
    public int[] levelOrder(TreeNode root) {
    	if(root==null)return new int[0];
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
    	List<Integer> list=new ArrayList<Integer>();
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		TreeNode node=queue.poll();
    		list.add(node.val);
    		if(node.left!=null)queue.offer(node.left);
    		if(node.right!=null)queue.offer(node.right);
    	}
    	int [] result=new int[list.size()];
    	for(int i=0;i<result.length;i++) {
    		result[i]=list.get(i);
    	}
    	return result;
    }
}
