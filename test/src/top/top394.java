package top;

public class top394 {
	public String decodeString(String s) {
		return decodepartString(s,1,0,s.length()-1);
    }
	public String decodepartString(String s,int num,int start,int end) {
		StringBuilder sb=new StringBuilder();
		for(int i=start;i<=end;i++) {
			char c=s.charAt(i);
			if(c>='0'&&c<='9') {
				int count=c-'0';
				int j=i+1;
				for(;j<=end;j++) {
					char temp=s.charAt(j);
					if(temp>='0'&&temp<='9') {
						count=count*10+temp-'0';
					}else break;
				}
				int point=j+1,need=0;
				for(;point<=end;point++) {
					if(s.charAt(point)==']') {
						if(need==0)break;
						else need--;
					}else if(s.charAt(point)=='[') {
						need++;
					}
				}
				sb.append(decodepartString(s,count,j+1,point-1));
				i=point;
			}else if(c!=']'){
				sb.append(c);
			}
		}
		String result="";
		for(int i=0;i<num;i++)result+=sb.toString();
		return result;
    }
}
