package test;

public class offer43 {
    public int countDigitOne(int n) {
    	        // mulk ��ʾ 10^k
    	        // ������Ĵ����У����Է��� k ��û�б�ֱ��ʹ�õ�������ʹ�� 10^k��
    	        // ��Ϊ���ô��뿴��������ֱ�ۣ����ﱣ���� k
    	        long mulk = 1;
    	        int ans = 0;
    	        for (; n >= mulk;) {
    	            ans += (n / (mulk * 10)) * mulk + Math.min(Math.max(n % (mulk * 10) - mulk + 1, 0), mulk);
    	            mulk *= 10;
    	        }
    	        return ans;
    }
}
