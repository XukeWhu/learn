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
        s = s.strip(); // ɾ����β�ո�
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // �����׸��ո�
            res.append(s.substring(i + 1, j + 1) + " "); // ��ӵ���
            while(i >= 0 && s.charAt(i) == ' ') i--; // �������ʼ�ո�
            j = i; // j ָ���¸����ʵ�β�ַ�
        }
        return res.toString().trim(); // ת��Ϊ�ַ���������
    }
	public static void main(String [] args) {
		String s="a good   example";
		offer58d1 t=new offer58d1();
		s=t.reverseWords(s);
	}
}
