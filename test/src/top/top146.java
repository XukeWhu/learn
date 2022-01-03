package top;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class top146 {
	class Dlinknode{
		int key;
		int val;
		Dlinknode pre;
		Dlinknode next;
		public Dlinknode(){}
		public Dlinknode(int key_,int val_){
			key=key_;
			val=val_;
		}
	}
	Dlinknode head;
	Dlinknode tail;
	Map<Integer,Dlinknode>cache;
	int size;
    int nowsize;
	public top146(int capacity) {
		size=capacity;
		cache=new HashMap<Integer,Dlinknode>();
        head=new Dlinknode();
		tail=new Dlinknode();
        head.next=tail;
		tail.pre=head;
        nowsize=0;
    }
    
    public int get(int key) {
    	if(!cache.containsKey(key))return -1;
    	Dlinknode temp=cache.get(key);
    	update(temp);
    	return temp.val;
    }
    
    public void put(int key, int value) {
    	if(cache.containsKey(key)) {
    		Dlinknode temp=cache.get(key);
    		temp.val=value;
        	update(temp);
    	}else {
    		Dlinknode newnode=new Dlinknode(key,value);
            add(newnode);
    		cache.put(key, newnode);
            nowsize++;
    		if(nowsize>size) {
    			int delete=remove();
    			cache.remove(delete);
                nowsize--;
    		}
    	}
    }
    public void add(Dlinknode node) {
    	node.pre=head;
    	node.next=head.next;
    	head.next.pre=node;
    	head.next=node;
    }
    public void removeNode(Dlinknode node) {
    	node.next.pre=node.pre;
    	node.pre.next=node.next;
    }
    public void update(Dlinknode node) {
    	removeNode(node);
    	add(node);
    }
    public int remove() {
    	int res=tail.pre.key;
    	removeNode(tail.pre);
    	return res;
    }
}
