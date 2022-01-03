package top;

import java.util.HashSet;
import java.util.Set;

public class top3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>cs=new HashSet<Character>();
        int max=0,sum=0,start=0;
        for(int i=0;i<s.length();i++) {
        	if(cs.add(s.charAt(i))) {
        		sum++;
        	}else {
        		max=sum>max?sum:max;
        		for(int j=start;j<i;j++) {
        			if(s.charAt(j)==s.charAt(i)) {
        				start=j+1;
        				break;
        			}
        			cs.remove(s.charAt(j));
        			sum--;
        		}
        	}
        }
        max=sum>max?sum:max;
        return max;
    }
}
