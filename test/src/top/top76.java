package top;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class top76 {
    public String minWindow(String s, String t) {
    	Map<Character,Integer>m=new HashMap<>();
    	List<Character>l=new ArrayList<>();
    	int start=-1,end=-1,len=Integer.MAX_VALUE,p=0;
    	for(int i=0;i<t.length();i++) {
    		char c=t.charAt(i);
    		if(m.containsKey(c))m.put(c, m.get(c)+1);
    		else {
    			m.put(c, 1);
    			l.add(c);
    		}
    	}
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(m.containsKey(c)) {
    			int count=m.get(c)-1;
    			m.put(c, count);
    			if(count<=0) {
    				boolean f=true;
    				for(int j=0;j<l.size();j++) {
    					if(m.get(l.get(j))>0) {
    						f=false;
    						break;
    					}
    				}
    				if(f){
    					while(!m.containsKey(s.charAt(p))||m.get(s.charAt(p))+1<=0) {
    						if(m.containsKey(s.charAt(p)))m.put(s.charAt(p),m.get(s.charAt(p))+1);
    						p++;
    					}
    					if(i-p+1<len) {
    						len=i-p+1;
    						start=p;
    						end=i;
    					}
    				}
    			}
    		}
    	}
    	if(start==-1)return"";
    	return s.substring(start, end+1);
    }
    //Mapµü´ú
    Map<Character, Integer> ori = new HashMap<Character, Integer>();
    Map<Character, Integer> cnt = new HashMap<Character, Integer>();
    public boolean check() {
        Iterator iter = ori.entrySet().iterator(); 
        while (iter.hasNext()) { 
            Map.Entry entry = (Map.Entry) iter.next(); 
            Character key = (Character) entry.getKey(); 
            Integer val = (Integer) entry.getValue(); 
            if (cnt.getOrDefault(key, 0) < val) {
                return false;
            }
        } 
        return true;
    }
}
