package top;

import java.util.Deque;
import java.util.LinkedList;

public class top5 {
	public String longestPalindrome(String s) {
    	int len=s.length();
    	if(len<2)return s;
    	int maxlen=1;
    	int begin=0;
    	boolean [][] dp=new boolean[len][len];
    	for(int i=0;i<len;i++) {
    		dp[i][i]=true;
    	}
    	for(int L=2;L<=len;L++) {
    		for(int i=0;i<len;i++) {
    			int j=i+L-1;
    			if(j>=len)break;
    			if(s.charAt(i)!=s.charAt(j)) {
    				dp[i][j]=false;
    			}else if(j-i<2)dp[i][j]=true;
    			else dp[i][j]=dp[i+1][j-1];
    			if(dp[i][j]&&j-i+1>maxlen) {
    				maxlen=j-i+1;
    				begin=i;
    			}
    		}
    	}
    	return s.substring(begin,begin+maxlen);
    }
}
