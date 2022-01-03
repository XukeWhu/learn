package top;

import java.util.HashMap;
import java.util.Map;

public class top1 {
	public int[] twoSum(int[] nums, int target) {
		int [] result=new int[2];
		Map<Integer,Integer>s=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			if(s.containsKey(nums[i])) {
				result[0]=s.get(nums[i]);
				result[1]=i;
				return result;
			}else {
				s.put(target-nums[i], i);
			}
		}
		return result;
    }
}
