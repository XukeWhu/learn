package top;

public class top461 {
	public int hammingDistance(int x, int y) {
		int result=0,s=x^y;
		while(s!=0) {
			result+=s&1;
			s>>=1;
		}
		return result;
    }
}
