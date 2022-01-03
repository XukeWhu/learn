package top;

public class top37 {
	public void solveSudoku(char[][] board) {
		int[][]count=new int[27][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]!='.') {
					int n=board[i][j]-'1',temp=i/3+(j/3)*3;
					count[i+9][n]++;
					count[j+18][n]++;
					count[temp][n]++;
				}
			}
		}
		solvedSudoku(board,count,0);
    }
	public boolean solvedSudoku(char[][] board,int[][]count,int num) {
		while(num<81&&board[num/9][num%9]!='.')num++;
		if(num==81)return true;
		int row=num/9,col=num%9,temp=row/3+(col/3)*3;
		for(int i=0;i<9;i++) {
			int sum=count[row+9][i]+count[col+18][i]+count[temp][i];
			if(sum==0) {
				board[row][col]=(char) ('1'+i);
				count[row+9][i]=1;
				count[col+18][i]=1;
				count[temp][i]=1;
				num++;
				if(solvedSudoku(board,count,num))return true;
				num--;
				board[row][col]='.';
				count[row+9][i]=0;
				count[col+18][i]=0;
				count[temp][i]=0;
			}
		}
		return false;
	}
}
