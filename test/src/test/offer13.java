package test;

import java.util.LinkedList;
import java.util.Queue;

public class offer13 {
	public int count(int x) {
		int sum=0;
		while(x>=10) {
			sum=sum+x%10;
			x=x/10;
		}
		return sum+x;
	}
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        Queue<int[]> queue= new LinkedList<int[]>();
        queue.add(new int[] { 0, 0, 0, 0 });
        while(queue.size() > 0) {
            int[] x = queue.poll();
            int i = x[0], j = x[1], si = x[2], sj = x[3];
            if(i >= m || j >= n || k < si + sj || visited[i][j]) continue;
            visited[i][j] = true;
            res ++;
            queue.add(new int[] { i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj });
            queue.add(new int[] { i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8 });
        }
        return res;
    }
	public static void main(String[] args) {
		offer13 o=new offer13();
		System.out.println(o.movingCount(3, 2, 17));
	}
}
