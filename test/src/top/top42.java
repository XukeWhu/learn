package top;

import java.util.Comparator;
import java.util.PriorityQueue;

public class top42 {
    public int trap(int[] height) {
    	int len=height.length,sum=0;
    	if(len<3)return 0;
    	int [] left=new int[len];
    	int [] right=new int[len];
    	left[0]=height[0];
    	for(int i=1;i<len;i++) {
    		left[i]=Math.max(height[i],left[i-1]);
    	}
    	right[len-1]=height[len-1];
    	for(int i=len-2;i>=0;i--) {
    		right[i]=Math.max(height[i],right[i+1]);
    	}
    	for(int i=1;i<len-1;i++) {
    		sum+=Math.min(left[i], right[i])-height[i];
    	}
    	return sum;
    }
}
