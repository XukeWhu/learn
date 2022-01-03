package top;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class top20 {
    public boolean isValid(String s) {
    	Deque<Character> cl=new LinkedList<>();
    	for(int i=0;i<s.length();i++) {
    		char temp=s.charAt(i);
    		if(temp=='{'||temp=='['||temp=='(') {
    			cl.push(temp);
    		}else if(temp==')'){
    			if(cl.isEmpty()||cl.poll()!='(')return false;
    		}else if(temp==']'){
    			if(cl.isEmpty()||cl.poll()!='[')return false;
    		}else{
    			if(cl.isEmpty()||cl.poll()!='{')return false;
    		}
    	}
    	return cl.isEmpty();
    }
}
