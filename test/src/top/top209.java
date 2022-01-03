package top;

public class top209 {
	public int minSubArrayLen(int target, int[] nums) {
		int len=Integer.MAX_VALUE;
		int sum=0,first=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			while(sum>=target) {
				if(i-first+1<len) {
					len=i-first+1;
				}
				sum-=nums[first];
				first++;
			}
		}
		return len==Integer.MAX_VALUE?0:len;
    }
}
