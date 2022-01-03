package test;

public class offer15 {
	public int count(int n) {
		int num=0;
		while(n!=0) {
			if(n%2==1)num++;
			n=n>>1;
		}
		return num;
	}
    public int hammingWeight(int n) {
		int num=0;
		while(n!=0) {
			num=num+(n&1);
			n>>>=1;
		}
		return num;
    }
}
