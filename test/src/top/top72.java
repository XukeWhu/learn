package top;

public class top72 {
    public int minDistance(String word1, String word2) {
    	int m=word1.length();
    	int n=word2.length();
    	if(m*n==0)return m+n;
    	int [][] res=new int[m+1][n+1];
    	for(int i=0;i<m+1;i++) {
    		res[i][0]=i;
    	}
    	for(int i=0;i<n+1;i++) {
    		res[0][i]=i;
    	}
    	for(int i=1;i<=m;i++) {
    		for(int j=1;j<=n;j++) {
    			int left=res[i-1][j]+1;
    			int down=res[i][j-1]+1;
    			int last=res[i-1][j-1];
    			if(word1.charAt(i-1)!=word2.charAt(j-1)) {
    				last++;
    			}
    			res[i][j]=Math.min(left, Math.min(down, last));
    		}
    	}
    	return res[m][n];
    }
}
