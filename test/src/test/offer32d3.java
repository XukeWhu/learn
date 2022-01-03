package test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import test.offer32d2.TreeNode;

public class offer32d3 {
	public class TreeNode {
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode(int x) { val = x; }
	}
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	if(root==null) return result;
    	List<TreeNode> nodelist=new ArrayList<TreeNode>();
    	nodelist.add(root);
    	int deep=1;
    	while(!nodelist.isEmpty()) {
        	List<Integer> temp=new ArrayList<Integer>();
        	List<TreeNode> newnodelist=new ArrayList<TreeNode>();
        	for(TreeNode node:nodelist) {
        		if(node.left!=null)newnodelist.add(node.left);
        		if(node.right!=null)newnodelist.add(node.right);
        	}
        	if(deep%2==1) {
        		for(TreeNode node:nodelist) {
            		temp.add(node.val);
            	}
        	}else {
        		for(int i=nodelist.size()-1;i>=0;i--) {
        			temp.add(nodelist.get(i).val);
        		}
        	}
        	deep++;
        	result.add(temp);
        	nodelist=newnodelist;
    	}
    	return result;
    }
}
