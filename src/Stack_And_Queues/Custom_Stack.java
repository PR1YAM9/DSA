package Stack_And_Queues;

public class Custom_Stack {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	int ptr = -1;
	
	public Custom_Stack() {
		this.data = new int[DEFAULT_SIZE];
	}
	
	public Custom_Stack(int size) {
		this.data = new int[size];
	}
	public boolean push(int num) {
		if(isFull()) {
			System.out.println("stack is full");
			return false;
		}
		
		ptr++;
		data[ptr]= num;
		return true;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is empty cannot pop");
		}
		int top = data[ptr];
		ptr--;
		return top;
	}
	public int peak() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is empty cannot peak");
		}
		return data[ptr];
	}
	
	public boolean isFull() {
		return (ptr == data.length-1);
	}
	public boolean isEmpty() {
		return (ptr == -1);
	}
}
