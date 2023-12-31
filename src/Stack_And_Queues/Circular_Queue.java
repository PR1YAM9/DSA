package Stack_And_Queues;

public class Circular_Queue {
	private int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	protected int front =0;
	protected int end = 0;
	protected int size =0;
	
	public Circular_Queue() {
		this.data = new int[DEFAULT_SIZE];
	}
	public Circular_Queue(int size) {
		this.data = new int[size];
	}
	public boolean isFull() {
		return size == data.length;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean insert(int num) {
		if(isFull()) {
			System.out.println("Queue is full");
			return false;
		}
		data[end]=num;
		end++;
		
		end = end% data.length;
		
		size++;
		return true;
	}
	public int remove() throws Exception{
		if(isEmpty()){
			throw new Exception("Queue is empty cannot remove");
		}
		int remove = data[front++];
		front = front % data.length;
		size--;
		return remove;
	}
	public int front() throws Exception {
		if(isEmpty()){
			throw new Exception("Queue is empty cannot show front");
		}
		return data[front];
	}
	public void display() throws Exception {
		if(isEmpty()){
			throw new Exception("Queue is empty ");
		}
		int i = front;
		do {
			System.out.println(data[i]);
			i++;
			i = i% data.length;
		}while(i!= end);
		System.out.println("End");
	}
}
