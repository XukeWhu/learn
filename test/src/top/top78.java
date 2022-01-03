package top;

import java.util.ArrayList;
import java.util.List;

public class top78 {
	List<Integer>now;
	List<List<Integer>>res;
	public List<List<Integer>> subsets(int[] nums) {
		now=new ArrayList<>();
		res=new ArrayList<>();
		dfs(nums,0);
		return res;
    }
	public void dfs(int[] nums,int point) {
		if(point==nums.length) {
			res.add(new ArrayList<>(now));
			return;
		}
		dfs(nums,point+1);
		now.add(nums[point]);
		dfs(nums,point+1);
		now.remove(now.size()-1);
	}
}
