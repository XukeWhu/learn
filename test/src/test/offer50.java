package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class offer50 {
    public char firstUniqChar(String s) {
    	Map<Character, Integer> dic = new HashMap<>();
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		if(dic.containsKey(ch)) {
    			dic.put(ch, dic.get(ch)+1);
    		}else {
    			dic.put(ch, 1);
    		}
    	}
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		if(dic.get(ch)==1) {
    			return ch;
    		}
    	}
    	return ' ';
    }
}
