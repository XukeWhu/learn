package top;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class top155 {
	Deque<Integer>dq;
	Deque<Integer>min;
	public top155() {
		dq=new LinkedList<>();
		min=new LinkedList<>(); 
		min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
    	dq.push(val);
    	min.push(Math.min(min.peek(), val));
    }
    
    public void pop() {
    	dq.pop();
    	min.pop();
    }
    
    public int top() {
    	return dq.peek();
    }
    
    public int getMin() {
    	return min.peek();
    }
}
