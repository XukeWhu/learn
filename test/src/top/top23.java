package top;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class top23 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
    public ListNode mergeKLists(ListNode[] lists) {
    	ListNode result=new ListNode(-1);
    	ListNode point=result;
    	List<ListNode>l=new ArrayList<>();
    	for(int i=0;i<lists.length;i++) {
    		if(lists[i]!=null)l.add(lists[i]);
    	}
    	while(!l.isEmpty()) {
    		int minc=0,min=Integer.MAX_VALUE;
    		for(int i=0;i<l.size();i++) {
        		if(l.get(i).val<min) {
        			minc=i;
        			min=l.get(i).val;
        		}
        	}
    		if(min!=Integer.MAX_VALUE) {
    			point.next=l.get(minc);
    			point=point.next;
    			ListNode temp=l.get(minc).next;
    			if(temp==null)l.remove(minc);
    			else l.set(minc, l.get(minc).next);
    		}
    	}
    	return result.next;
    }
    
    class Status implements Comparable<Status> {
        int val;
        ListNode ptr;

        Status(int val, ListNode ptr) {
            this.val = val;
            this.ptr = ptr;
        }

        public int compareTo(Status status2) {
            return this.val - status2.val;
        }
    }

    PriorityQueue<Status> queue = new PriorityQueue<Status>();

    public ListNode mergeKLists2(ListNode[] lists) {
        for (ListNode node: lists) {
            if (node != null) {
                queue.offer(new Status(node.val, node));
            }
        }
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (!queue.isEmpty()) {
            Status f = queue.poll();
            tail.next = f.ptr;
            tail = tail.next;
            if (f.ptr.next != null) {
                queue.offer(new Status(f.ptr.next.val, f.ptr.next));
            }
        }
        return head.next;
    }
}
