package top;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class top208 {
	Set<String>ls;
	public top208() {
		ls=new HashSet<String>();
    }
    
    public void insert(String word) {
    	ls.add(word);
    }
    
    public boolean search(String word) {
    	return ls.contains(word);
    }
    
    public boolean startsWith(String prefix) {
    	for(String s:ls) {
    		if(hasprefix(s,prefix))return true;
    	}
    	return false;
    }
    public boolean hasprefix(String s,String prefix) {
    	if(s.length()<prefix.length())return false;
    	int plen=prefix.length();
    	for(int i=0;i<plen;i++) {
    		if(prefix.charAt(i)!=s.charAt(i))return false;
    	}
    	return true;
    }
}
