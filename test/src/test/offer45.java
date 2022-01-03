package test;

import java.util.ArrayList;
import java.util.List;

public class offer45 {
	public String minNumber(int[] nums) {
		List<String> strList = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            strList.add(String.valueOf(nums[i]));
        }
        strList.sort((a, b) -> (a + b).compareTo(b + a));
        StringBuilder sb = new StringBuilder();
        for (String str : strList) {
            sb.append(str);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		int [] temp= {10,2};
		offer45 t=new offer45();
		String f=t.minNumber(temp);
	}
}
