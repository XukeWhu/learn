package top;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class top399{
	class node{
		node father;
		double mul;
		public node(){
			
		}
		public node(node father,double mul){
			this.father=father;
			this.mul=mul;
		}
	}
	public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
		Map<String,node>m=new HashMap<>();
		for(int i=0;i<equations.size();i++) {
			List<String>temp=equations.get(i);
			String first=temp.get(0),second=temp.get(1);
			double firstmul=1,secondmul=1;
			node f=null,s=null;
			if(m.containsKey(first)) {
				f=m.get(first);
				while(f.father!=null) {
					firstmul*=f.mul;
					f=f.father;
				}
			}
			if(m.containsKey(second)) {
				s=m.get(second);
				while(s.father!=null) {
					secondmul*=s.mul;
					s=s.father;
				}
			}
			if(f==null&&s==null) {
				f=new node();
				s=new node(f,values[i]);
				m.put(first, f);
				m.put(second, s);
			}else if(f!=null&&s!=null){
				if(f==s)continue;
				s.father=f;
				s.mul=firstmul/secondmul*values[i];
			}else if(f==null) {
				f=new node(s,secondmul/values[i]);
				m.put(first, f);
			}else {
				s=new node(f,firstmul*values[i]);
				m.put(second, s);
			}
		}
		int len=queries.size();
		double[]result=new double[len];
		for(int i=0;i<len;i++) {
			List<String>temp=queries.get(i);
			String first=temp.get(0),second=temp.get(1);
			double firstmul=1,secondmul=1;
			node f=null,s=null;
			if(m.containsKey(first)) {
				f=m.get(first);
				while(f.father!=null) {
					firstmul*=f.mul;
					f=f.father;
				}
			}
			if(f==null) {
				result[i]=-1.0;
				continue;
			}
			if(m.containsKey(second)) {
				s=m.get(second);
				while(s.father!=null) {
					secondmul*=s.mul;
					s=s.father;
				}
			}
			if(s==null||f!=s) {
				result[i]=-1.0;
				continue;
			}
			result[i]=secondmul/firstmul;
		}
		return result;
    }
}
