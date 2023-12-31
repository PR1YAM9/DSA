package LinkedListBasics;

public class DLL {
	
	private Node head;
	Node tail;
	int size =0;
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next=head;
		node.prev = null;
		if(head != null) {
			head.prev  = node;
		}
		head = node;
		size++;
	}
	
	public void display() {
		Node temp = head;
		Node last = null;
		while(temp!=null){
			last = temp;
			System.out.print(temp.value+"->");
			temp = temp.next;
		}
		System.out.println("END");
		while(last!=null) {
			 System.out.print(last.value+"->");
			 last = last.prev;
		 }
		 System.out.println("Start");
	}
	
	
	private class Node{
		Node prev;
		int value;
		Node next;
		
		public Node(int value) {
			this.value= value;
		}
		
		public Node(Node prev, int value, Node next) {
			this.prev= prev;
			this.value= value;
			this.next = next;
		}
	
	}	
}
