package top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class top438 {
	public List<Integer> findAnagrams(String s, String p) {
		if(s.length()<p.length())return new ArrayList<>();
		List<Integer>result=new ArrayList<>();
		int [] pcount=new int[26];
		int plen=p.length();
		int [] scount=new int[26];
		for(int i=0;i<plen;i++){
			pcount[p.charAt(i)-'a']++;
			scount[s.charAt(i)-'a']++;
		}
		int num=s.length()-plen;
		for(int i=0;i<num;i++) {
			if(Arrays.equals(scount, pcount))result.add(i);
			scount[s.charAt(i+plen)-'a']++;
			scount[s.charAt(i)-'a']--;
		}
		if(Arrays.equals(scount, pcount))result.add(num);
		return result;
    }
}
