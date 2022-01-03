package top;

public class top79 {
	public boolean exist(char[][] board, String word) {
		int m=board.length,n=board[0].length;
		boolean[][]visited=new boolean[m][n];
		char c=word.charAt(0);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++) {
				if(board[i][j]==c&&find(board,word,0,visited,i,j))return true;
			}
		}
		return false;
    }
	public boolean find(char[][] board, String word,int k,boolean[][]visited,int i,int j) {
		if(k==word.length()-1)return true;
		visited[i][j]=true;
		char c=word.charAt(k+1);
		boolean res=false;
		if(i-1>=0&&!visited[i-1][j]&&board[i-1][j]==c)res|=find(board,word,k+1,visited,i-1,j);
		if(!res&&j-1>=0&&!visited[i][j-1]&&board[i][j-1]==c)res|=find(board,word,k+1,visited,i,j-1);
		if(!res&&i+1<board.length&&!visited[i+1][j]&&board[i+1][j]==c)res|=find(board,word,k+1,visited,i+1,j);
		if(!res&&j+1<board[0].length&&!visited[i][j+1]&&board[i][j+1]==c)res|=find(board,word,k+1,visited,i,j+1);
		visited[i][j]=false;
		return res;
	}
}
