package top;

import top.top160.ListNode;

public class top206 {
	public ListNode reverseList(ListNode head) {
		ListNode pre=null;
		ListNode cur=head;
		while(cur!=null) {
			ListNode next=cur.next;
			cur.next=pre;
			pre=cur;
			cur=next;
		}
		return pre;
    }
}
