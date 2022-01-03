package test;

public class offer67 {
    public int strToInt(String str) {
    	char[] c=str.strip().toCharArray();
    	if(c.length==0) return 0;
    	int bound=Integer.MAX_VALUE/10,sign=1,begin=1;
    	int sum=0;
    	if(c[0]=='-') sign=-1;
    	else if(c[0]!='+') begin=0;
    	for(int i=begin;i<c.length;i++) {
    		if(c[i]>'9'||c[i]<'0') break;
    		if(sum>bound||(sum==bound && c[i]>'7')) return sign==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
    		sum=sum*10+c[i]-'0';
    	}
    	return sum*sign;
    }
    public int strToInt2(String str) {
        char[] c = str.trim().toCharArray();
        if(c.length == 0) return 0;
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        int i = 1, sign = 1;
        if(c[0] == '-') sign = -1;
        else if(c[0] != '+') i = 0;
        for(int j = i; j < c.length; j++) {
            if(c[j] < '0' || c[j] > '9') break;
            if(res > bndry || res == bndry && c[j] > '7') return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (c[j] - '0');
        }
        return sign * res;
    }

    public static void main(String[] args) {
    	offer67 t=new offer67();
    	System.out.println(t.strToInt("-12"));
    }
}
