package test;

import java.util.HashMap;
import java.util.Map;

public class offer35 {
	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();
        // 3. ���Ƹ��ڵ㣬������ ��ԭ�ڵ� -> �½ڵ㡱 �� Map ӳ��
        while(cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        // 4. ����������� next �� random ָ��
        while(cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        // 5. �����������ͷ�ڵ�
        return map.get(head);
    }
}
