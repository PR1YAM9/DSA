package Stack_And_Queues;

public class Dynamic_Stack extends Custom_Stack{
	public Dynamic_Stack() {
		super();
	}
	public Dynamic_Stack(int size) {
		super(size);
	}
	
	@Override
	public boolean push(int num) {
		if(isFull()) {
			int[] temp = new int[data.length *2];
			
			for(int i=0;i<data.length;i++) {
				temp[i] = data[i];
			}
			
			data = temp;
		}
		return super.push(num);
	}
}
