package top;

import java.util.Arrays;

public class top238 {
	public int[] productExceptSelf(int[] nums) {
		int len=nums.length;
		int [] result=new int[len];
		result[0]=1;
		for(int i=1;i<len;i++) {
			result[i]=result[i-1]*nums[i-1];
		}
		int temp=1;
		for(int i=len-2;i>=0;i--) {
			temp=nums[i+1]*temp;
			result[i]=result[i]*temp;
		}
		return result;
    }
}
