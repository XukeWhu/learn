package top;

import test.offer18.ListNode;

public class top2 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int temp=0,high=0;
    	ListNode head=new ListNode(0);
    	ListNode tnode=head;
    	while(l1!=null||l2!=null||high!=0) {
    		temp=0;
    		if(l1!=null) {
    			temp+=l1.val;
    			l1=l1.next;
    		}
    		if(l2!=null) {
    			temp+=l2.val;
    			l2=l2.next;
    		}
    		temp=temp+high;
    		high=temp/10;
    		tnode.next=new ListNode(temp%10);
    		tnode=tnode.next;
    	}
    	return head.next;
    }
}
