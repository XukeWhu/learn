package top;

import java.util.ArrayList;
import java.util.List;

public class top39 {
	List<Integer>now;
	List<List<Integer>>result;
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		now=new ArrayList<Integer>();
		result=new ArrayList<List<Integer>>();
		findcombinationSum(candidates, target,0);
		return result;
    }
	public void findcombinationSum(int[] candidates, int target,int start) {
		if(target==0) {
			result.add(new ArrayList<Integer>(now));
			return;
		}
		for(int i=start;i<candidates.length;i++) {
			if(candidates[i]<=target) {
				now.add(candidates[i]);
				findcombinationSum(candidates,target-candidates[i],i);
				now.remove(now.size()-1);
			}
		}
	}
}
