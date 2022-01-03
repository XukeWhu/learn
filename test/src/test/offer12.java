package test;

public class offer12 {
	public boolean find(char[][] board, String word,int [][] record,int point,int i,int j) {
		if(i>=0&&i<board.length&&j>=0&&j<board[0].length&&board[i][j]==word.charAt(point)&&record[i][j]!=1) {
			record[i][j]=1;
			point=point+1;
			boolean result;
			if(point==word.length()) {
				result=true;
			}else {
				result=find(board,word,record,point,i-1,j)||find(board,word,record,point,i,j-1)||find(board,word,record,point,i+1,j)||find(board,word,record,point,i,j+1);
			}
			record[i][j]=0;
			return result;
		}
		return false;
	}
    public boolean exist(char[][] board, String word) {
    	int [][] record=new int[board.length][board[0].length];
    	for(int i=0;i<board.length;i++) {
    		for(int j=0;j<board[0].length;j++) {
    			record=new int[board.length][board[0].length];
    			if(find(board,word,record,0,i,j)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
	public static void main(String[] args) {
		char[][] board= {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
		String word="ABCESEEEFS";
		offer12 o=new offer12();
		System.out.println(o.exist(board, word));
	}
}
