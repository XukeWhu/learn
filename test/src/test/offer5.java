package test;

public class offer5 {
	public String replaceSpace(String s) {
		StringBuilder result=new StringBuilder();
		char [] temp=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==' ') {
				result.append("%20");
			}else {
				result.append(s.charAt(i));
			}
		}
		return result.toString();
    }
}
