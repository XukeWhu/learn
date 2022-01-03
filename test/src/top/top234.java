package top;

import java.util.Deque;
import java.util.LinkedList;

import top.top23.ListNode;

public class top234 {
	public boolean isPalindrome(ListNode head) {
		int len=0;
		ListNode p=head;
		while(p!=null) {
			len++;
			p=p.next;
		}
		Deque<ListNode>dq=new LinkedList<>();
		p=head;
		for(int i=0;i<len/2;i++) {
			dq.push(p);
			p=p.next;
		}
		if((len&1)==1)p=p.next;
		for(int i=0;i<len/2;i++) {
			ListNode node=dq.pop();
			if(p.val!=node.val)return false;
			p=p.next;
		}
		return true;
    }
}
