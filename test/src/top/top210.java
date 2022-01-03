package top;

import java.util.ArrayList;
import java.util.List;

public class top210 {
	int [] visited;
	int [] Order;
	List<List<Integer>> edges;
	boolean enable;
	int start;
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		visited=new int[numCourses];
		Order=new int[numCourses];
		edges=new ArrayList<>();
		enable=true;
		start=numCourses-1;
		for(int i=0;i<numCourses;i++) {
			edges.add(new ArrayList<>());
		}
		for(int i=0;i<prerequisites.length;i++) {
			int [] course=prerequisites[i];
			List<Integer> temp=edges.get(course[1]);
			temp.add(course[0]);
		}
		for(int i=0;i<numCourses;i++) {
			if(visited[i]==0)visit(i);
		}
		return enable?Order:new int[0];
    }
	public void visit(int i) {
		if(!enable)return;
		visited[i]=1;
		List<Integer>edge=edges.get(i);
		for(int next:edge) {
			if(visited[next]==0)visit(next);
			else if(visited[next]==1) {
				enable=false;
				return;
			}
		}
		visited[i]=2;
		Order[start]=i;
		start--;
	}
}
