package test;

public class offer22 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode getKthFromEnd(ListNode head, int k) {
    	ListNode temp=head;
    	for(int i=0;i<k;i++) temp=temp.next;
    	while(temp!=null) {
    		temp=temp.next;
    		head=head.next;
    	}
    	return head;
    }
}
