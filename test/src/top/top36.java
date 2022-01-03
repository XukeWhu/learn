package top;

public class top36 {
	public boolean isValidSudoku(char[][] board) {
		int[][]count=new int[27][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]!='.') {
					int n=board[i][j]-'1';
					if(count[i+9][n]==1)return false;
					else count[i+9][n]++;
					if(count[j+18][n]==1)return false;
					else count[j+18][n]++;
					int temp=i/3+(j/3)*3;
					if(count[temp][n]==1)return false;
					else count[temp][n]++;
				}
			}
		}
		return true;
    }
}
