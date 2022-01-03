package top;

public class top990 {
	public boolean equationsPossible(String[] equations) {
		int [] re=new int[26];
		for(int i=0;i<26;i++)re[i]=i;
		for(int i=0;i<equations.length;i++) {
			if(equations[i].charAt(1)=='=') {
				int first=equations[i].charAt(0)-'a',second=equations[i].charAt(3)-'a';
				while(re[first]!=first)first=re[first];
				while(re[second]!=second)second=re[second];
				re[first]=second;
			}
		}
		for(int i=0;i<equations.length;i++) {
			if(equations[i].charAt(1)=='!') {
				int first=equations[i].charAt(0)-'a',second=equations[i].charAt(3)-'a';
				while(re[first]!=first)first=re[first];
				while(re[second]!=second)second=re[second];
				if(first==second)return false;
			}
		}
		return true;
    }
}
