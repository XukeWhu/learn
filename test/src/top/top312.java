package top;

public class top312 {
	public int maxCoins(int[] nums) {
		int n=nums.length;
		int [][] rec=new int[n+2][n+2];
		int [] val=new int[n+2];
		for(int i=1;i<=n;i++) {
			val[i]=nums[i-1];
		}
		val[0]=1;
		val[n+1]=1;
		for(int i=n-1;i>=0;i--) {
			for(int j=i+2;j<n+2;j++) {
				for(int k=i+1;k<j;k++) {
					int sum=val[i]*val[j]*val[k];
					sum+=rec[i][k]+rec[k][j];
					rec[i][j]=Math.max(sum, rec[i][j]);
				}
			}
		}
		return rec[0][n+1];
    }
}
