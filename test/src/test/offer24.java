package test;


public class offer24 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode reverseList(ListNode head) {
    	if(head==null) return null;
    	ListNode temp=new ListNode(head.val);
    	ListNode result=temp;
    	while(head.next!=null) {
    		temp=new ListNode(head.next.val);
    		temp.next=result;
    		result=temp;
    		head=head.next;
    	}
    	return result;
    }
}
