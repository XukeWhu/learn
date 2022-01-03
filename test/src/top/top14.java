package top;

public class top14 {
    public String longestCommonPrefix(String[] strs) {
    	StringBuilder result=new StringBuilder();
    	result.append(strs[0]);
    	for(int i=0;i<strs.length;i++) {
    		if(strs[i].length()==0)return "";
    		int j=0;
    		while(j<strs[i].length() && j<result.length()) {
    			if(strs[i].charAt(j)!=result.charAt(j))break;
    			j++;
    		}
    		result=new StringBuilder().append(result.substring(0, j));
    	}
    	return result.toString();
    }
}
