package top;

public class top221 {
	public int maximalSquare(char[][] matrix) {
		int m=matrix.length,n=matrix[0].length,max=0;
		int [][] dp=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]=='1') {
					dp[i][j]=(j==0||i==0)?1:Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]))+1;
					int now=dp[i][j]*dp[i][j];
					if(now>max)max=now;
				}
			}
		}
		return max;
    }
}
