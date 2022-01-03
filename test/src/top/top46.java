package top;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class top46 {
	public List<List<Integer>> result;
	public List<Integer> temp;
	public List<List<Integer>> permute(int[] nums) {
		result=new ArrayList<>();
		temp=new ArrayList<>();
		for(int i=0;i<nums.length;i++)temp.add(nums[i]);
		find(0,nums.length);
		return result;
    }
	public void find(int point,int len) {
		if(point==len-1)result.add(new ArrayList<>(temp));
		for(int i=point+1;i<len;i++) {
			Collections.swap(temp, point, i);
			find(point+1,len);
			Collections.swap(temp, point, i);
		}
	}
}
