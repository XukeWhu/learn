package top;

import java.util.Arrays;

public class top416 {
	public boolean canPartition(int[] nums) {
		int n=nums.length;
		if(n<2)return false;
		int sum=0,max=0;
		for(int num:nums) {
			sum+=num;
			max=Math.max(num, max);
		}
		int target=sum/2;
		if(sum%2==1||max>target)return false;
		boolean[][]dp=new boolean[n][target+1];
		for(int i=0;i<n;i++)dp[i][0]=true;
		dp[0][nums[0]]=true;
		for(int i=1;i<n;i++) {
			int num=nums[i];
			for(int j=1;j<target+1;j++) {
				if(j>=num) {
					dp[i][j]=dp[i-1][j]|dp[i-1][j-num];
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n-1][target];
    }
	
}
