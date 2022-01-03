package top;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class top406 {
	public int[][] reconstructQueue(int[][] people) {
		PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int [] o1,int [] o2) {
				if(o2[0]!=o1[0])return o2[0]-o1[0];
				else return o1[1]-o2[1];
			}
		});
		for(int i=0;i<people.length;i++)pq.add(people[i]);
		List<int[]>result=new ArrayList<>();
		while(!pq.isEmpty()) {
			int[]temp=pq.poll();
			result.add(temp[1],temp);
		}
		return result.toArray(new int[result.size()][]);
    }
}
