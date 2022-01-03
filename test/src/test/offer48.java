package test;

import java.util.HashMap;
import java.util.Map;

public class offer48 {
	public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int i = -1, res = 0;
        for(int j = 0; j < s.length(); j++) {
            if(dic.containsKey(s.charAt(j)))
                i = Math.max(i, dic.get(s.charAt(j))); // ������ָ�� i
            dic.put(s.charAt(j), j); // ��ϣ���¼
            res = Math.max(res, j - i); // ���½��
        }
        return res;
    }
}
