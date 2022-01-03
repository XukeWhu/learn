package top;

import java.util.Map;

public class top169 {
	public int majorityElement(int[] nums) {
		int cur=nums[0],curnum=1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]!=cur)curnum--;
            else curnum++;
			if(curnum<0) {
				cur=nums[i];
				curnum=1;
			}
		}
		return cur;
    }
}
