package top;

public class top70 {
	public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 0; i < n; ++i) {
            p = q; 
            q = r; 
            r = p + q;
        }
        return r;
    }
}
