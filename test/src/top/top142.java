package top;

import java.util.HashSet;
import java.util.Set;

import top.top19.ListNode;

public class top142 {
	public ListNode detectCycleme(ListNode head) {
        Set<ListNode>s=new HashSet<ListNode>();
        while(head!=null) {
        	if(!s.add(head))return head;
        	head=head.next;
        }
        return null;
    }
	public ListNode detectCycle(ListNode head) {
		if(head==null)return null;
		ListNode fast=head,slow=head;
		while(fast!=null) {
			if(fast.next!=null) {
				fast=fast.next.next;
			}else return null;
			slow=slow.next;
			if(fast==slow) {
				ListNode p=head;
				while(p!=slow) {
					p=p.next;
					slow=slow.next;
				}
				return p;
			}
		}
		return null;
    }
}
