package top;

import java.util.ArrayList;
import java.util.List;

public class top448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int len=nums.length;
		int [] n=new int[len];
		for(int i=0;i<len;i++) {
			n[nums[i]-1]++;
		}
		List<Integer>result=new ArrayList<>();
		for(int i=0;i<len;i++) {
			if(n[i]==0)result.add(i+1);
		}
		return result;
    }
}
