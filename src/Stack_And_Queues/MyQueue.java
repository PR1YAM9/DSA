package Stack_And_Queues;

import java.util.Stack;
//Implement Queue Using Stack

class MyQueue {
	private Stack<Integer> S1;
    private Stack<Integer> S2;

    public MyQueue() {
        S1 = new Stack<>();
        S2 = new Stack<>();
    }
    
    public void push(int x) {
        S1.push(x);
    }
    
    public int pop() {
        while(!S1.isEmpty()){
            S2.push(S1.pop());
        }
        int first = S2.pop();
        while(!S2.isEmpty()){
            S1.push(S2.pop());
        }
        return first;
    }
    
    public int peek() {
        while(!S1.isEmpty()){
            S2.push(S1.pop());
        }
        int first = S2.peek();
        while(!S2.isEmpty()){
            S1.push(S2.pop());
        }
        return first;
    }
    
    public boolean empty() {
        return S1.isEmpty();
    }
	
}
