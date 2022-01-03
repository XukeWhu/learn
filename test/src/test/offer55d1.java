package test;


public class offer55d1 {
	public class TreeNode {
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode(int x) { val = x; }
	}
	public int dfs(TreeNode root,int deep) {
		int newdeep=deep;
		if(root==null)return newdeep;
		newdeep++;
		newdeep=Math.max(dfs(root.left,newdeep),dfs(root.right,newdeep));
		return newdeep;
	}
    public int maxDepth(TreeNode root) {
    	int deep=dfs(root,0);
    	return deep;
    }
}
