package top;

public class top6 {
    public String convert(String s, int numRows) {
    	if(numRows<2)return s;
    	String [] result=new String[numRows];
    	for(int i=0;i<numRows;i++) {
    		result[i]="";
    	}
    	int flag=0,how=1;
    	for(int i=0;i<s.length();i++) {
    		result[flag]+=s.charAt(i);
    		if(how==1) {
    			flag++;
    			if(flag==numRows-1)how=0;
    		}
    		else{
    			flag--;
    			if(flag==0)how=1;
    		}
    	}
    	String res="";
    	for(int i=0;i<numRows;i++) {
    		res+=result[i];
    	}
    	return res;
    }
    public static void main(String [] args) {
    	top6 t=new top6();
    	t.convert("AYPLISIRIG", 2);
    }
}
