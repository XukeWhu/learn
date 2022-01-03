package top;

public class top121 {
	public int maxProfit(int[] prices) {
		int max=0,maxv=prices[prices.length-1];
		for(int i=prices.length-2;i>=0;i--) {
			if(maxv-prices[i]>max)max=maxv-prices[i];
			if(prices[i]>maxv)maxv=prices[i];
		}
		return max;
    }
}
