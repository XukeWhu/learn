package test;

import java.util.HashSet;
import java.util.Set;

public class offer61 {
    public boolean isStraight(int[] nums) {
    	Set<Integer> repeat=new HashSet<>();
        int max=0;
        int min=14;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==0)continue;
        	if(nums[i]<min) min=nums[i];
        	if(nums[i]>max) max=nums[i];
        	if(repeat.contains(nums[i])) return false;
        	repeat.add(nums[i]);
        }
        if(max-min>4) {
        	return false;
        }
        return true;
    }
}
