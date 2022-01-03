package top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class top18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> result=new ArrayList<>();
    	if(nums.length<4)return result;
    	Arrays.sort(nums);
    	int len=nums.length;
    	for(int i=0;i<len-3;i++) {
    		if(i!=0&&nums[i]==nums[i-1])continue;
    		for(int j=i+1;j<len-2;j++) {
    			if(j!=i+1&&nums[j]==nums[j-1])continue;
    			int start=j+1,end=len-1,t=target-nums[i]-nums[j];
    			while(start<end) {
    				if(nums[start]+nums[end]==t) {
    					List<Integer> temp=new ArrayList<Integer>();
    					temp.add(nums[i]);
    					temp.add(nums[j]);
    					temp.add(nums[start]);
    					temp.add(nums[end]);
       					result.add(temp);
    					int old=nums[start];
    					while(nums[start]==old&&start<end)start++;
    				}else if(nums[start]+nums[end]<t) {
    					start++;
    				}else {
    					end--;
    				}
    			}
    		}
    	}
    	return result;
    }
}
