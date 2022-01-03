package test;

public class offer65 {
    public int add(int a, int b) {
    	while(b!=0) {
    		int c=(a&b)>>1;
    		a=a^b;
    		b=c;
    	}
    	return a;
    }
	public static void main(String[] args) {
		offer65 o=new offer65();
		System.out.println(o.add(899,111));
	}
}
