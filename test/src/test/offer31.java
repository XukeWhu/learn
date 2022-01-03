package test;

import java.util.Deque;
import java.util.LinkedList;

public class offer31 {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Deque<Integer> stack = new LinkedList<>();
        int i = 0;
        for(int num : pushed) {
            stack.push(num); // num 入栈
            while(!stack.isEmpty() && stack.peek() == popped[i]) { // 循环判断与出栈
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String [] args) {
    	offer31 of=new offer31();
    	int [] pushed= {1,0};
    	int [] popped= {1,0};
    	System.out.println(of.validateStackSequences(pushed, popped));
    }
}
