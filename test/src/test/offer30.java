package test;

import java.util.Deque;
import java.util.LinkedList;

public class offer30 {
	class MinStack {
	    /** initialize your data structure here. */
		Deque<Integer> s1;
		Deque<Integer> sf;
	    public MinStack() {
	    	s1=new LinkedList<Integer>();
	    	sf=new LinkedList<Integer>();
	    }
	    public void push(int x) {
	    	s1.push(x);
	    	if(sf.isEmpty()) {
	    		sf.push(x);
	    	}else if(x<=sf.peek()) {
	    		sf.push(x);
	    	}
	    }
	    public void pop() {
	    	if(s1.peek().equals(sf.peek())) {
	    		sf.pop();
	    	}
            s1.pop();
	    }
	    public int top() {
	    	return s1.peek();
	    }
	    public int min() {
	    	return sf.peek();
	    }
	}
	public static void main(String [] args) {
		offer30 of=new offer30();
		MinStack s=of.new MinStack();
		s.push(512);
		s.push(-1024);
		s.push(-1024);
		s.push(512);
		System.out.println(s.top());
		s.pop();
		System.out.println(s.min());
		System.out.println(s.top());
		s.pop();
		System.out.println(s.min());
		System.out.println(s.top());
		s.pop();
		System.out.println(s.min());
		System.out.println(s.top());
	}
}
