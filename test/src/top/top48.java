package top;

public class top48 {
	public void rotate(int[][] matrix) {
    	int len=matrix.length;
    	int [] temp=new int[len];
    	int left=0,right=len-1;
    	while(right>left) {
    		for(int i=left;i<=right;i++) {
    			temp[i]=matrix[left][i];
    		}
    		for(int i=left;i<=right;i++) {
    			matrix[left][i]=matrix[right-i+left][left];
    		}
    		for(int i=left;i<=right;i++) {
    			matrix[i][left]=matrix[right][i];
    		}
    		for(int i=left;i<=right;i++) {
    			matrix[right][i]=matrix[right-i+left][right];
    		}
    		for(int i=left;i<=right;i++) {
    			matrix[i][right]=temp[i];
    		}
    		right--;
            left++;
    	}
    }
}
