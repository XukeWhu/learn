package top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class top56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
    	List<int[]>temp=new ArrayList<>();
    	int [] num=intervals[0];
    	for(int i=1;i<intervals.length;i++) {
    		int [] t=intervals[i];
    		if(t[0]<=num[1]) {
    			num[1]=Math.max(num[1], t[1]);
    		}else {
    			temp.add(num);
    			num=intervals[i];
    		}
    	}
    	temp.add(num);
    	return temp.toArray(new int[temp.size()][]);
    }
    
}
