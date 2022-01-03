package top;


public class top148 {
	public class ListNode{
	    int val;
	    ListNode next;
	    ListNode(){};
	    ListNode(int x) { val = x; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public ListNode sortList(ListNode head) {
		if(head==null||head.next==null)return head;
		ListNode fast=head,slow=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		ListNode tmp=slow.next;
		slow.next=null;
		ListNode right=sortList(tmp);
		ListNode left=sortList(head);
		ListNode res=new ListNode(0);
		ListNode p=res;
		while(left!=null&&right!=null) {
			if(left.val<right.val) {
				p.next=left;
				left=left.next;
			}else {
				p.next=right;
				right=right.next;
			}
			p=p.next;
		}
		p.next=left==null?right:left;
		return res.next;
    }
}
