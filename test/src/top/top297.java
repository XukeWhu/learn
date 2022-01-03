package top;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class top297 {
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
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return rserialize(root,"");
    }
    public String rserialize(TreeNode root,String result) {
    	if(root==null)return result+"nonode,";
    	result+=root.val+",";
    	result=rserialize(root.left,result);
    	result=rserialize(root.right,result);
    	return result;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[]datas=data.split(",");
        List<String>l=new ArrayList<String>(Arrays.asList(datas));
        return rdeserialize(l);
    }
    
    public TreeNode rdeserialize(List<String>l) {
    	if(l.get(0).equals("nonode")) {
    		l.remove(0);
    		return null;
    	}
    	TreeNode root=new TreeNode(Integer.parseInt(l.get(0)));
    	l.remove(0);
    	root.left=rdeserialize(l);
    	root.right=rdeserialize(l);
    	return root;
    }
}
