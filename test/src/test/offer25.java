package test;

public class offer25 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode head1=l1,head2=l2;
    	ListNode result,temp;
    	result=new ListNode(0);
    	temp=result;
    	while(head1!=null) {
    		while(head2!=null&&head2.val<=head1.val) {
    			temp.next=head2;
    			head2=head2.next;
    			temp=temp.next;
    		}
    		temp.next=head1;
			head1=head1.next;
			temp=temp.next;
    	}
    	if(head1!=null)temp.next=head1;
    	if(head2!=null)temp.next=head2;
    	return result.next;
    }
}
