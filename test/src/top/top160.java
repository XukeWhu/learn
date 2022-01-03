package top;


public class top160 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m=0;
        int n=0;
        ListNode p=headA;
        while(p!=null) {
        	m++;
        	p=p.next;
        }
        p=headB;
        while(p!=null) {
        	n++;
        	p=p.next;
        }
        if(m>n) {
        	for(int i=0;i<m-n;i++)headA=headA.next;
        }else {
        	for(int i=0;i<n-m;i++)headB=headB.next;
        }
        while(headA!=null) {
        	if(headA==headB)return headA;
        	headA=headA.next;
        	headB=headB.next;
        }
        return null;
    }
}
