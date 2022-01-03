package top;

public class top85 {
    public int maximalRectangle(char[][] matrix) {
    	int m = matrix.length;
        if (m == 0) {
            return 0;
        }
        int n = matrix[0].length;
        int[][] left = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    left[i][j] = (j == 0 ? 0 : left[i][j - 1]) + 1;
                }
            }
        }
        int res=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            	if(matrix[i][j] == '1') {
            		int width=left[i][j];
            		int temp=width;
            		for(int z=i-1;z>=0;z++) {
            			width=Math.min(width, left[z][j]);
            			temp=Math.max(temp, width*(i-z+1));
            		}
            		res=Math.max(temp,res);
            	}
            }
        }
        return res;
    }
}
