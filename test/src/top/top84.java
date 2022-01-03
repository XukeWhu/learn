package top;

import java.util.Deque;
import java.util.LinkedList;

public class top84 {
	public int largestRectangleArea(int[] heights) {
		int n=heights.length;
		int [] left=new int[n];
		int [] right=new int[n];
		Deque<Integer> dq=new LinkedList<>();
		for(int i=0;i<n;i++) {
			while(!dq.isEmpty()&&heights[i]<=heights[dq.peek()]) {
				dq.poll();
			}
			left[i]=dq.isEmpty()?-1:dq.peek();
			dq.push(i);
		}
		dq.clear();
		for(int i=n-1;i>=0;i--) {
			while(!dq.isEmpty()&&heights[i]<=heights[dq.peek()]) {
				dq.poll();
			}
			right[i]=dq.isEmpty()?n:dq.peek();
			dq.push(i);
		}
		int res=0;
		for(int i=0;i<n;i++) {
			res=Math.max(res, (right[i]-left[i]-1)*heights[i]);
		}
		return res;
    }
}
