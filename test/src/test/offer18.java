package test;

public class offer18 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode deleteNode(ListNode head, int val) {
    	if(head==null) return null;
    	if(head.val==val) return head.next;
    	ListNode temp=head;
    	ListNode next=temp.next;
    	while(next!=null) {
    		if(next.val==val) {
    			temp.next=next.next;
    			break;
    		}else {
    			temp=next;
    			next=next.next;
    		}
    	}
    	return head;
    }
}
