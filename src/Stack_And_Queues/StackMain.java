package Stack_And_Queues;

public class StackMain {

	public static void main(String[] args) throws Exception {
		Custom_Stack stack = new Custom_Stack(5);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		stack.push(10);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
