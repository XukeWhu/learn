package top;

import java.util.Collections;

public class top31 {
	public void nextPermutation(int[] nums) {
		int len=nums.length;
		for(int i=len-2;i>=0;i--) {
			if(nums[i]<nums[i+1]) {
				for(int j=i+1;j<len;j++) {
					if(nums[j]<=nums[i]) {
						int temp=nums[j-1];
						nums[j-1]=nums[i];
						nums[i]=temp;
						break;
					}else if(j==len-1) {
						int temp=nums[j];
						nums[j]=nums[i];
						nums[i]=temp;
					}
				}
				for(int j=i+1;j<(len+i+1)/2;j++) {
					int temp=nums[j];
					nums[j]=nums[len+i-j];
					nums[len+i-j]=temp;
				}
				return;
			}
		}
		for(int i=0;i<len/2;i++) {
			int temp=nums[i];
			nums[i]=nums[len-i-1];
			nums[len-i-1]=temp;
		}
    }
	public void reorder(int[]nums,int start) {
		
	}
}
