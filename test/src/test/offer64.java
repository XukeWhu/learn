package test;

public class offer64 {
    public int sumNums(int n) {
    	boolean f=(n>0)&&((n+=sumNums(n-1))>0);
    	return n;
    }
}
