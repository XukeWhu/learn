package test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class offer9 {
	class CQueue {
		Deque<Integer> s1;
		Deque<Integer> s2;
	    public CQueue() {
	    	s1=new LinkedList<Integer>();
	    	s2=new LinkedList<Integer>();
	    }
	    public void appendTail(int value) {
	    	s1.push(value);
	    }
	    public int deleteHead() {
	    	if(s2.isEmpty()) {
	    		while(!s1.isEmpty()) {
	    			s2.push(s1.pop());
	    		}
	    	}else {
	    		return s2.pop();
	    	}
	    	if(s2.isEmpty()) {
	    		return -1;
	    	}else {
	    		return s2.pop();
	    	}
	    	
	    }
	}
}
