package test;

public class test {
	public int[] spiralOrder(int[][] matrix) {
    	int [] result=new int[matrix.length*matrix[0].length];
    	if(matrix.length==0||matrix[0].length==0) {
    		return result;
    	}
    	int left=0,right=matrix[0].length-1,top=0,bot=matrix.length-1,type=0,i=0,j=0,num=0;
    	while(num<result.length) {
    		if(type==0) {
    			while(j<=right) {
    				result[num]=matrix[i][j];
    				j++;
    				num++;
    			}
    			j=right;
    			top++;
    			i=top;
    			type=1;
    		}else if(type==1) {
    			while(i<=bot) {
    				result[num]=matrix[i][j];
    				i++;
    				num++;
    			}
    			i=bot;
    			right--;
    			j=right;
    			type=2;
    		}else if(type==2) {
    			while(j>=left) {
    				result[num]=matrix[i][j];
    				j--;
    				num++;
    			}
    			j=left;
    			bot--;
    			i=bot;
    			type=3;
    		}else {
    			while(i>=top) {
    				result[num]=matrix[i][j];
    				i--;
    				num++;
    			}
    			i=top;
    			left++;
    			j=left;
    			type=0;
    		}
    	}
    	result[num]=matrix[top][left];
    	return result;
    }
	public static void main(String[] args) {
        int t=11/2;
        System.out.println(t+"");
 
	}

}
