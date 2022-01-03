package test;

import java.util.HashSet;
import java.util.Set;

public class offer03 {
	public int findRepeatNumber(int[] nums) {
        Set<Integer>s=new HashSet<Integer>();
        for(int num:nums) {
        	if(!s.add(num)) {
        		return num;
        	}
        }
        return 0;
    }
}
