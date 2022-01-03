package top;

import java.util.Deque;
import java.util.LinkedList;

public class top32 {
	public int longestValidParentheses(String s) {
		char [] cs=s.toCharArray();
		int [] lens=new int[cs.length+1];
		int max=0;
		for(int i=2;i<cs.length+1;i++) {
			if(cs[i-1]==')') {
				if(cs[i-2]=='(') lens[i]=lens[i-2]+2;
				else if(i-2-lens[i-1]>=0&&cs[i-2-lens[i-1]]=='('){
                    lens[i]=lens[i-1]+lens[i-2-lens[i-1]]+2;
                }
			}
			max=Math.max(max, lens[i]);
		}
		return max;
    }
}
