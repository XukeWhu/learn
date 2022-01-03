package test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class offer41 {
	private PriorityQueue<Integer> right;
	private PriorityQueue<Integer> left;
    public offer41() {
        right=new PriorityQueue<Integer>();
        left=new PriorityQueue<Integer>((x,y)->y-x);
    }
    
    public void addNum(int num) {//¿ÉÓÅ»¯
    	if(left.size()==0) {
    		left.add(num);
    	}else if(right.size()==0) {
    		if(num>left.peek()) {
    			right.add(num);
    		}else {
    			right.add(left.poll());
    			left.add(num);
    		}
    	}else if(right.size()>left.size()) {
    		if(right.peek()>num) {
    			left.add(num);
    		}else {
    			left.add(right.poll());
    			right.add(num);
    		}
    	}else {
    		if(left.peek()<num) {
    			right.add(num);
    		}else {
    			right.add(left.poll());
    			left.add(num);
    		}
    	}
    }
    
    public double findMedian() {
    	if(left.size()==0)return 0;
    	if(left.size()>right.size())return left.peek();
    	else if(right.size()>left.size())return right.peek();
    	else {
    		double result=left.peek()+right.peek();
    		return result/2.0;
    	}
    }
}
