package test;

public class offer4 {
	public boolean findNumberIn2DArray(int[][] matrix, int target) {
		if(matrix.length == 0)
            return false;
        int x = 0;
        int y = matrix.length - 1;
        while(x < matrix[0].length && y >= 0){
            if(matrix[y][x] > target) {
                y--;
            } else if(matrix[y][x] < target) {
                x++;
            } else {
                return true;
            }
        }
        return false;
	}
}
