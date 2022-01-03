package test;

import java.util.HashMap;
import java.util.Map;

public class offer20 {
	    public boolean isNumber(String s) {
	        Map[] states = {
	            new HashMap<Character,Integer>() {{ put(' ', 0); put('s', 1); put('d', 2); put('.', 4); }}, // 0.
	            new HashMap<>() {{ put('d', 2); put('.', 4); }},                           // 1.
	            new HashMap<>() {{ put('d', 2); put('.', 3); put('e', 5); put(' ', 8); }}, // 2.
	            new HashMap<>() {{ put('d', 3); put('e', 5); put(' ', 8); }},              // 3.
	            new HashMap<>() {{ put('d', 3); }},                                        // 4.
	            new HashMap<>() {{ put('s', 6); put('d', 7); }},                           // 5.
	            new HashMap<>() {{ put('d', 7); }},                                        // 6.
	            new HashMap<>() {{ put('d', 7); put(' ', 8); }},                           // 7.
	            new HashMap<>() {{ put(' ', 8); }}                                         // 8.
	        };
	        int p = 0;
	        char t;
	        for(char c : s.toCharArray()) {
	            if(c >= '0' && c <= '9') t = 'd';
	            else if(c == '+' || c == '-') t = 's';
	            else if(c == 'e' || c == 'E') t = 'e';
	            else if(c == '.' || c == ' ') t = c;
	            else t = '?';
	            if(!states[p].containsKey(t)) return false;
	            p = (int)states[p].get(t);
	        }
	        return p == 2 || p == 3 || p == 7 || p == 8;
	    }

	public boolean isint(String s) {
		if(s.length()==0)return false;
		int i=0;
		if(s.charAt(0)=='+'||s.charAt(0)=='-') {
			if(s.length()==1)return false;
			i=1;
		}
		for(;i<s.length();i++) {
			if(s.charAt(i)>'9'||s.charAt(i)<'0')return false;
		}
		return true;
	}
	public boolean isfloat(String s) {
		if(s.length()==0)return false;
		boolean point=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='.') {
				if(point) {
					return false;
				}else {
					point=true;
				}
			}
		}
		if(!point)return false;
		int i=0;
		if(s.charAt(0)=='+'||s.charAt(0)=='-') {
			if(s.length()==1)return false;
			i=1;
		}
		String [] temp=s.substring(i).split("\\.");
		if(temp.length==0)return false;
		for(i=0;i<temp[0].length();i++) {
			if(temp[0].charAt(i)>'9'||temp[0].charAt(i)<'0')return false;
		}
		if(temp.length==1)return true;
		for(i=0;i<temp[1].length();i++) {
			if(temp[1].charAt(i)>'9'||temp[1].charAt(i)<'0')return false;
		}
		return true;
	}
    public boolean isNumber2(String s) {
    	String num=s.strip();
        if(num.length()==0)return false;
        if(num.charAt(num.length()-1)=='e'||num.charAt(num.length()-1)=='E')return false;
    	String [] temp=num.split("e");
    	if(temp.length==1)temp=num.split("E");
    	if(temp.length==2) {
    		return (isint(temp[0])||isfloat(temp[0]))&&isint(temp[1]);
    	}
    	return isint(num)||isfloat(num);
    }
    public static void main(String []args) {
    	String s="-.";
    	offer20 o=new offer20();
    	System.out.println(o.isNumber(s));
    }
}
