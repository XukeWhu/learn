package top;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class top239 {
	public int[] maxSlidingWindow(int[] nums, int k) {
		int len=nums.length-k+1;
		int [] result=new int[len];
		Deque<Integer>dq=new LinkedList<>();
		for(int i=0;i<k;i++) {
			while(!dq.isEmpty()&&nums[i]>=nums[dq.peekLast()]) {
				dq.pollLast();
			}
			dq.addLast(i);
		}
		result[0]=nums[dq.peekFirst()];
		for(int i=1;i<len;i++) {
			while(!dq.isEmpty()&&nums[i+k-1]>=nums[dq.peekLast()]) {
				dq.pollLast();
			}
			dq.addLast(i+k-1);
			while(!dq.isEmpty()&&dq.peekFirst()<i) {
				dq.pollFirst();
			}
			result[i]=nums[dq.peekFirst()];
		}
		return result;
    }
}
