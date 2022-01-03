package top;

public class top300 {
	public int lengthOfLIS(int[] nums) {
		int n=nums.length,allmax=1;
		int [] dp=new int[n];
		dp[0]=1;
		for(int i=1;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(nums[i]>nums[j])dp[i]=Math.max(dp[j]+1,dp[i]);
			}
			allmax=Math.max(dp[i], allmax);
		}
		return allmax;
    }
}
