package test;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class offer59d1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
    	if(nums.length==0) {
    		return new int [0];
    	}
    	int n=nums.length;
    	int [] result=new int[n-k+1];
    	PriorityQueue<int[]> pq=new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]!=o2[0]?o2[0]-o1[0]:o2[0]-o1[0];
			}
    	});
    	for(int i=0;i<k;i++) {
    		pq.offer(new int[] {nums[i],i});
    	}
    	result[0]=pq.peek()[0];
    	for(int i=k;i<n;i++) {
    		pq.offer(new int[] {
    			nums[i],i	
    		});
    		while(pq.peek()[1]<=i-k) {
    			pq.poll();
    		}
    		result[i-k+1]=pq.peek()[0];
    	}
    	return result;
    }
    public int[] maxSlidingWindow2(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for(int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            // ɾ�� deque �ж�Ӧ�� nums[i-1]
            if(i > 0 && deque.peekFirst() == nums[i - 1])
                deque.removeFirst();
            // ���� deque �ݼ�
            while(!deque.isEmpty() && deque.peekLast() < nums[j])
                deque.removeLast();
            deque.addLast(nums[j]);
            // ��¼�������ֵ
            if(i >= 0)
                res[i] = deque.peekFirst();
        }
        return res;
    }
}
