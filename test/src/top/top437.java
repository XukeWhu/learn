package top;

import java.util.HashMap;
import java.util.Map;

import top.top124.TreeNode;

public class top437 {
	public int pathSum(TreeNode root, int targetSum) {
		if(root==null)return 0;
		int count=dfs(root,targetSum);
		count+=pathSum(root.left,targetSum);
		count+=pathSum(root.right,targetSum);
		return count;
    }
	public int dfs(TreeNode root, int targetSum) {
		if(root==null)return 0;
		int ret=0;
		int val=root.val;
		if(val==targetSum)ret++;
		ret+=dfs(root.left,targetSum-val);
		ret+=dfs(root.right,targetSum-val);
		return ret;
	}
	
	public int pathSum2(TreeNode root, int targetSum) {
		Map<Long,Integer>m=new HashMap<>();
		m.put(0L, 1);
		return dfs2(root,m,0,targetSum);
    }
	
	public int dfs2(TreeNode root, Map<Long,Integer>m, long curr,int targetSum) {
		if(root==null)return 0;
		int ret=0;
		curr+=root.val;
		ret=m.getOrDefault(curr-targetSum, 0);
		m.put(curr, m.getOrDefault(curr, 0)+1);
		ret+=dfs2(root.left,m,curr,targetSum);
		ret+=dfs2(root.right,m,curr,targetSum);
		m.put(curr, m.get(curr)-1);
		return ret;
	}
}
