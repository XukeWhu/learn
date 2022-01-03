package test;

import java.awt.List;
import java.util.ArrayList;

public class offer57d2 {
	public int[][] findContinuousSequence(int target) {
		ArrayList<int []> al=new ArrayList<int[]>();
		int begin=1;
		int sum=1;
		for(int i=1;i<=(target/2)+1;) {
			if(sum==target) {
				int [] temp=new int[i-begin+1];
				for(int j=begin;j<=i;j++) {
					temp[j-begin]=j;
				}
				al.add(temp);
				sum=sum-begin;
				begin++;
			}else if(sum>target) {
				sum=sum-begin;
				begin++;
			}else {
				i++;
				sum=sum+i;
			}
			
		}
		int[][]result=new int[al.size()][];
		for(int i=0;i<al.size();i++) {
			result[i]=al.get(i);
		}
		return result;
    }
}
