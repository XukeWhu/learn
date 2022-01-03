package top;

import java.util.HashSet;
import java.util.Set;

import top.top21.ListNode;


public class top141 {
	public boolean hasCycleme(ListNode head) {
        Set<ListNode>s=new HashSet<>();
        while(head!=null) {
        	if(!s.add(head))return true;
        	head=head.next;
        }
        return false;
    }
	public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
