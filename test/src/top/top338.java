package top;

public class top338 {
	public int[] countBits(int n) {
		if(n==0)return new int[] {0};
		int [] result=new int[n+1];
		int now=0,start=1;
		result[0]=0;
		while(start<n+1){
			int temp=1<<now;
			if(start>=temp) {
				now++;
			}else temp>>=1;
			result[start]=result[start-temp]+1;
			start++;
		}
		return result;
    }
}
