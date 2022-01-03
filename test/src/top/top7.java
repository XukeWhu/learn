package top;

public class top7 {
	public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
    public static void main(String [] args) {
    	top7 t=new top7();
    	System.out.println(t.reverse(1563847412));
    }
}
