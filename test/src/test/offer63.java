package test;

public class offer63 {
    public int maxProfit(int[] prices) {
    	int mairu=Integer.MAX_VALUE;
    	int max=0;
    	for(int i=0;i<prices.length;i++) {
    		if(prices[i]-mairu>max)max=prices[i]-mairu;
    		if(prices[i]<mairu)mairu=prices[i];
    	}
    	return max;
    }
    public static void main(String[] args) {
    	offer63 o=new offer63();
    	System.out.println("ssss");
    	int [] x=new int[] {7,6,4,3,1};
    	System.out.println(o.maxProfit(x));
    }
}
