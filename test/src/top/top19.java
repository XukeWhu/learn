package top;

public class top19 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode first=head,second=head;
    	for(int i=0;i<n-1;i++) {
    		first=first.next;
    	}
    	if(first.next==null)return head.next;
    	else first=first.next;
    	while(first.next!=null) {
    		first=first.next;
    		second=second.next;
    	}
    	second.next=second.next.next;
    	return head;
    }
}
