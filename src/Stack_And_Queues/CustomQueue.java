package Stack_And_Queues;

public class CustomQueue {

	private int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	int end = 0;
	
	public CustomQueue() {
		this.data = new int[DEFAULT_SIZE];
	}
	public CustomQueue(int size) {
		this.data = new int[size];
	}
	public boolean isFull() {
		return end == data.length;
	}
	public boolean isEmpty() {
		return end == 0;
	}
	
	public boolean insert(int num) {
		if(isFull()) {
			System.out.println("Queue is full");
			return false;
		}
		else {
			data[end]= num;
			end++;
			return true;
		}
	}
	public int remove() throws Exception{
		if(isEmpty()){
			throw new Exception("Queue is empty cannot remove");
		}
		int first = data[0];
		for(int i = 1;i<end;i++) {
			data[i-1]= data[i];
		}
		end--;
		return first;
	}
	public int front() throws Exception {
		if(isEmpty()){
			throw new Exception("Queue is empty cannot show front");
		}
		return data[0];
	}
	public void display() throws Exception {
		if(isEmpty()){
			throw new Exception("Queue is empty ");
		}
		for(int i =0;i<end;i++) {
			System.out.println(data[i]);
		}
	}
}
