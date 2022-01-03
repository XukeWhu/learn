package top;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class top207 {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int pathlen=prerequisites.length;
		int [] visited=new int[numCourses];
		Map<Integer,List<Integer>>path=new HashMap<>();
		for(int i=0;i<pathlen;i++) {
			int key=prerequisites[i][0];
			List<Integer> temp=path.getOrDefault(key, new ArrayList<Integer>());
			temp.add(prerequisites[i][1]);
			path.put(key,temp);
		}
		for(int i=0;i<numCourses;i++) {
			if(visited[i]==0) {
				if(!visit(visited,path,i))return false;
			}
		}
		return true;
    }
	public boolean visit(int [] visited,Map<Integer,List<Integer>>path,int start) {
		visited[start]=1;
		if(!path.containsKey(start)) {
			visited[start]=2;
			return true;
		}
		List<Integer>temp=path.get(start);
		for(int next:temp) {
			if(visited[next]==0) {
				if(!visit(visited,path,next))return false;
			}else if(visited[next]==1) {
				return false;
			}
		}
		visited[start]=2;
		return true;
	}
}
