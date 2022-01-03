package top;

public class top29 {
	public int divide(int dividend, int divisor) {
        int sum=0,base=1;
		if (dividend == Integer.MIN_VALUE) {
            if (divisor == 1) {
                return Integer.MIN_VALUE;
            }
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }
        int dend=dividend,dsor=divisor;
        if(dend>0)dend=-dend;
        if(dsor>0)dsor=-dsor;
        // 考虑除数为最小值的情况
        if (divisor == Integer.MIN_VALUE) {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }
        // 考虑被除数为 0 的情况
        if (dividend == 0) {
            return 0;
        }
		while(dsor>=(dend>>1)) {
			dsor<<=1;
			base<<=1;
		}
		while(dsor!=0&&dend!=0) {
			if(dend<=dsor) {
				dend-=dsor;
				sum+=base;
			}else {
				dsor>>=1;
				base>>=1;
			}
		}
		if((dividend>0&&divisor<0)||(dividend<0&&divisor>0))return -Math.abs(sum);
		else return Math.abs(sum);
    }
}
