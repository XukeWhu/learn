package top;

public class top200 {
	public int numIslands(char[][] grid) {
		int m=grid.length,n=grid[0].length;
		int num=0;
		boolean [][] visited=new boolean[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j]=='1'&&!visited[i][j]) {
					num++;
					visit(grid,visited,i,j);
				}
			}
		}
		return num;
    }
	public void visit(char[][] grid,boolean [][] visited,int i,int j) {
		if(i<0||j<0||i>=grid.length||j>=grid[0].length||visited[i][j]||grid[i][j]=='0')return;
		visited[i][j]=true;
		visit(grid,visited,i+1,j);
		visit(grid,visited,i,j+1);
		visit(grid,visited,i-1,j);
		visit(grid,visited,i,j-1);
	}
	class UnionFind {
		int count;
		int [] rank;
		int [] parent;
		public  UnionFind(char[][] grid) {
			int m=grid.length;
			int n=grid[0].length;
			rank=new int[m*n];
			parent=new int[m*n];
			count=0;
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(grid[i][j]=='1') {
						rank[i*n+j]=1;
						parent[i*n+j]=i*n+j;
						count++;
					}
				}
			}
		}
		public int find(int i) {
			if(parent[i]!=i)parent[i]=find(parent[i]);
			return parent[i];
		}
		public void union(int x,int y) {
			int first=find(x);
			int second=find(y);
			if(first!=second) {
				if(rank[first]>rank[second]) {
					parent[second]=first;
				}else if(rank[first]<rank[second]) {
					parent[first]=second;
				}else {
					parent[first]=second;
					rank[second]++;
				}
				count--;
			}
		}
		public int getcount() {
			return count;
		}
	}
	public int numIslands2(char[][] grid) {
		int m=grid.length,n=grid[0].length;
		UnionFind uf=new UnionFind(grid);
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j]=='1') {
					grid[i][j]='0';
					if(i-1>=0&&grid[i-1][j]=='1') {
						uf.union(i*n+j, i*n+j-n);
					}
					if(j-1>=0&&grid[i][j-1]=='1') {
						uf.union(i*n+j, i*n+j-1);
					}
					if(i+1<m&&grid[i+1][j]=='1') {
						uf.union(i*n+j, i*n+j+n);
					}
					if(j+1<n&&grid[i][j+1]=='1') {
						uf.union(i*n+j, i*n+j+1);
					}
				}
			}
		}
		return uf.getcount();
    }
}
