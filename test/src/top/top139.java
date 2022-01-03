package top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class top139 {
	public boolean wordBreak(String s, List<String> wordDict) {
		Set<String>ss=new HashSet<>(wordDict);
		int len=s.length();
		boolean [] dp=new boolean[len+1];
		dp[0]=true;
		for(int i=1;i<len+1;i++) {
			for(int j=0;j<i;j++) {
				if(dp[j]&&ss.contains(s.substring(j, i))) {
					dp[i]=true;
					break;
				}
			}
		}
		return dp[len];
	}
}
