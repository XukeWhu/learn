package test;

public class offer19 {
	public boolean compare(String s, String p,int i,int j) {
		if(i==0)return false;
		if(p.charAt(j-1)=='.'||s.charAt(i-1)==p.charAt(j-1))return true;
		return false;
	}
    public boolean isMatch(String s, String p) {
    	int m=s.length(),n=p.length();
    	boolean [][] match=new boolean[m+1][n+1];
    	match[0][0]=true;
    	for(int i=0;i<m+1;i++) {
    		for(int j=1;j<n+1;j++) {
    			if(p.charAt(j-1)=='*') {
    				match[i][j]=match[i][j-2];
    				if(compare(s,p,i,j-1)) {
    					match[i][j]=match[i-1][j]||match[i][j];
    				}
    			}else {
    				if(compare(s,p,i,j)) {
    					match[i][j]=match[i-1][j-1];
    				}
    			}
    		}
    	}
    	return match[m][n];
    }
}
