package test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class offer34 {
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
	class Solution {
		public List<List<Integer>> pathSum(TreeNode root, int target) {
			if(root==null)return new ArrayList<List<Integer>>();
			List<List<Integer>> result=new ArrayList<List<Integer>>();
			if(target==root.val) {
				if(root.left!=null||root.right!=null)return new ArrayList<List<Integer>>();
				LinkedList<Integer> temp=new LinkedList<Integer>();
				temp.push(target);
				result.add(temp);
			}else if(target>root.val) {
				List<List<Integer>> leftresult=pathSum(root.left,target-root.val);
				for(List<Integer> temp:leftresult) {
					LinkedList<Integer> temp2=(LinkedList<Integer>) temp;
					temp2.add(root.val);
					result.add(temp2);
				}
				List<List<Integer>> rightresult=pathSum(root.right,target-root.val);
				for(List<Integer> temp:rightresult) {
					LinkedList<Integer> temp2=(LinkedList<Integer>) temp;
					temp2.add(root.val);
					result.add(temp2);
				}
			}
			return result;
		}
		    List<List<Integer>> ret = new LinkedList<List<Integer>>();
		    Deque<Integer> path = new LinkedList<Integer>();

		    public List<List<Integer>> pathSum2(TreeNode root, int target) {
		        dfs(root, target);
		        return ret;
		    }

		    public void dfs(TreeNode root, int target) {
		        if (root == null) {
		            return;
		        }
		        path.offerLast(root.val);
		        target -= root.val;
		        if (root.left == null && root.right == null && target == 0) {
		            ret.add(new LinkedList<Integer>(path));
		        }
		        dfs(root.left, target);
		        dfs(root.right, target);
		        path.pollLast();
		    }
	}
}
