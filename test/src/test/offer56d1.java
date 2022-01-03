package test;

import java.util.HashSet;
import java.util.Set;

public class offer56d1 {
    public int[] singleNumbers(int[] nums) {
    	int res=0;
    	for(int i=0;i<nums.length;i++) {
    		res^=nums[i];
    	}
    	int div=1;
    	while((div&res)==0) {
    		div<<=1;
    	}
    	int a=0,b=0;
    	for(int i=0;i<nums.length;i++) {
    		if((div&nums[i])==0) {
    			a^=nums[i];
    		}else {
    			b^=nums[i];
    		}
    	}
    	return new int[] {a,b};
    }
}
