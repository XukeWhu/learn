package top;

public class top28 {
	public int strStr(String haystack, String needle) {
		int nlen=needle.length();
		if(nlen==0)return 0;
		int [] com=new int[needle.length()];
		for(int i=1,start=0;i<nlen;i++) {
			while (start > 0 && needle.charAt(i) != needle.charAt(start)) {
				start = com[start - 1];
            }
			if(needle.charAt(i)==needle.charAt(start))start++;
			com[i]=start;
		}
		for(int i=0,start=0;i<haystack.length()&&start<nlen;i++) {
			while (start > 0 && haystack.charAt(i) != needle.charAt(start)) {
				start = com[start - 1];
            }
			if(needle.charAt(start)==haystack.charAt(i))start++;
			if(start==nlen){
				return i-nlen+1;
			}
		}
		return -1;
    }
}
