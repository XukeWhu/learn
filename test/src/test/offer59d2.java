package test;

import java.util.Deque;
import java.util.LinkedList;

public class offer59d2 {
	class MaxQueue {
		Deque<Integer>dq;
		Deque<Integer>max;
	    public MaxQueue() {
	    	dq=new LinkedList<Integer>();
	    	max=new LinkedList<Integer>();
	    }
	    
	    public int max_value() {
	    	if(dq.isEmpty()) {
	    		return -1;
	    	}
	    	return max.peekFirst();
	    }
	    
	    public void push_back(int value) {
	    	dq.offer(value);
	    	while(!max.isEmpty()&&max.peekLast()<value) {
	    		max.pollLast();
	    	}
	    	max.offer(value);
	    }
	    
	    public int pop_front() {
	    	if(dq.isEmpty()) {
	    		return -1;
	    	}
	    	if(dq.peekFirst().equals(max.peekFirst())) {
	    		max.pollFirst();
	    	}
	    	return dq.pollFirst();
	    }
	}
}
