package test;

import java.util.ArrayList;
import java.util.List;

public class offer62 {
    public int lastRemaining(int n, int m) {
        int x = 0;
        for (int i = 2; i <= n; i++) {
            x = (x + m) % i;
        }
        return x;
    }
    public static void main(String[] args) {
    	offer62 o=new offer62();
    	System.out.println("ssss");
    	System.out.println(o.lastRemaining(5, 3));
    }
}
