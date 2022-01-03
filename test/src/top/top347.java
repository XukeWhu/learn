package top;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class top347 {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer,Integer>m=new HashMap<>();
		for(int num:nums) {
			m.put(num, m.getOrDefault(num, 0)+1);
		}
		PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int [] o1,int [] o2) {
				return o2[1]-o1[1];
			}
		});
		for(Map.Entry<Integer, Integer>entry:m.entrySet()) {
			pq.add(new int[]{entry.getKey(),entry.getValue()});
		}
		int [] result=new int[k];
		for(int i=0;i<k;i++) {
			result[i]=pq.poll()[0];
		}
		return result;
    }
}
