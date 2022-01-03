package top;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class top22 {
	List<String>result=new ArrayList<>();
	int len=0;
	public List<String> generateParenthesis(int n) {
		this.len=n;
		addString(new LinkedList<>(),0,new StringBuilder(),0);
		return result;
    }
	public void addString(Deque<Character>c,int n,StringBuilder s,int num) {
		if(n==2*len)result.add(s.toString());
		if(!c.isEmpty()) {
			s.append(')');
			c.poll();
			addString(c,n+1,s,num);
			s.deleteCharAt(n);
			c.push('(');
		}
		if(num<len) {
			c.push('(');
			s.append('(');
			addString(c,n+1,s,num+1);
			c.poll();
			s.deleteCharAt(n);
		}
	}
}
