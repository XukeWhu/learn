package top;

public class top10 {
    public boolean isMatch(String s, String p) {
    	boolean [][] res=new boolean[s.length()+1][p.length()+1];
    	res[0][0]=true;
    	for(int i=0;i<=s.length();i++) {
    		for(int j=1;j<=p.length();j++) {
    			if(p.charAt(j-1)=='*') {
        			res[i][j]=res[i][j-2];
        			if(match(s,p,i,j-1)) {
        				res[i][j]|=res[i-1][j];
        			}
        		}else if(match(s,p,i,j)) {
        			res[i][j]=res[i-1][j-1];
        		}
    		}
    	}
    	return res[s.length()][p.length()];
    }
    public boolean match(String s,String p,int i,int j) {
    	if(i==0)return false;
    	if(p.charAt(j-1)=='.')return true;
    	else return p.charAt(j-1)==s.charAt(i-1);
    }
}
