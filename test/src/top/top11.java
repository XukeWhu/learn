package top;

public class top11 {
    public int maxArea(int[] height) {
    		int start=0,end=height.length-1;
    		int max=0;
    		while(start<end) {
    			int temp=Math.min(height[start], height[end])*(end-start);
    			max=Math.max(max, temp);
    			if(height[start]<height[end])start++;
    			else end--;
    		}
    		return max;
    }
}
