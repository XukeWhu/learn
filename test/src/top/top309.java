package top;

public class top309 {
	public int maxProfit(int[] prices) {
		int len=prices.length;
		if(len<3)return 0;
		int [] dp=new int[len];
		dp[0]=0;
		for(int i=1;i<len;i++) {
			int max=0;
			for(int j=0;j<i;j++) {
				max=Math.max(max, dp[j]);
				if(prices[j]<prices[i]) {
					int temp=j>=2?dp[j-2]:0;
					max=Math.max(max, temp+prices[i]-prices[j]);
				}
			}
			dp[i]=max;
		}
		return dp[len-1];
    }
	public int maxProfit2(int[] prices) {
		if(prices.length<2)return 0;
		int len=prices.length;
		int [][] dp=new int[len][3];
		dp[0][0]=-prices[0];
		for(int i=1;i<len;i++) {
			dp[i][0]=Math.max(dp[i-1][0], dp[i-1][2]-prices[i]);
			dp[i][1]=dp[i][0]+prices[i];
			dp[i][2]=Math.max(dp[i-1][1], dp[i-1][2]);
		}
		return Math.max(dp[len-1][1], dp[len-1][2]);
    }
}
