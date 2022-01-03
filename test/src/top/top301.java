package top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class top301 {
	List<String> res=new ArrayList<>();
	public List<String> removeInvalidParentheses(String s) {
		int leftmove=0,rightmove=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				leftmove++;
			}else if(s.charAt(i)==')') {
				if(leftmove>0)leftmove--;
				else rightmove++;
			}
		}
		addString(s,0,leftmove,rightmove);
		return res;
    }
	public void addString(String s,int index,int leftmove,int rightmove) {
		if(leftmove==0&&rightmove==0) {
			if(vaild(s)) {
				res.add(s);
			}
			return;
		}
		for(int i=index;i<s.length();i++) {
			if(i!=index&&s.charAt(i)==s.charAt(i-1))continue;
			char temp=s.charAt(i);
			if(leftmove+rightmove>s.length()-i) {
				return;
			}
			if(leftmove>0&&temp=='(') {
				addString(s.substring(0, i)+s.substring(i+1),i,leftmove-1,rightmove);
			}else if(rightmove>0&&temp==')') {
				addString(s.substring(0, i)+s.substring(i+1),i,leftmove,rightmove-1);
			}
		}
	}
	public boolean vaild(String s) {
		int left=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				left++;
			}else if(s.charAt(i)==')') {
				left--;
				if(left<0)return false;
			}
		}
		return left==0;
	}
	
}
