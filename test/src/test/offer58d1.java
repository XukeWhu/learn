package test;

public class offer58d1 {
	public String reverseWords(String s) {
		String [] temp=s.split(" ");
		for(int i=0;i<temp.length;i++) {
			if(!temp[i].equals("")) {
				System.out.println(temp[i]+"ss");
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=temp.length-1;i>=0;i--) {
			if(temp[i]!="") {
				sb.append(temp[i]);
				sb.append(" ");
			}
		}
		return sb.toString().strip();
    }
	public String reverseWordsnew(String s) {
        s = s.strip(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }
	public static void main(String [] args) {
		String s="a good   example";
		offer58d1 t=new offer58d1();
		s=t.reverseWords(s);
	}
}
