package LinkedListBasics;

import java.util.Iterator;

public class LL {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	public LL() {
		this.size =0; 
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
	}
	
	public void display() {
		Node temp= head;
		while(temp!=null) {
			System.out.print(temp.value +"->");
			temp = temp .next;
		}
		System.out.print("END");
	}
	
	public void insertLast(int val) {
		
		if(tail==null) {
			insertFirst(val);
		}
		
		Node node = new Node(val);
		tail.next= node;
		tail= node;
		size++;
	}
	
	public void insertLastNoTail(int val) {
		
		if(head==null) {
			insertFirst(val);
		}
		
		Node node = new Node(val);
		Node temp = head;
		while(temp.next!= null) {
			temp = temp.next;
		}
		temp.next= node;
		size++;
	}
	
	public void insert(int val, int idx) {
		
		if(idx ==0) {
			insertFirst(val);
			return;
		}
		if(idx==size) {
			insertLast(val);
			return;
		}
		
		Node temp = head;
		int i =0;
		while(i<idx-1) {
			temp = temp.next;
			i++;
		}
		Node node = new Node(val, temp.next);
		temp.next= node;
		size++;
	}
	
	public void deleteFirst() {
		if(head.next==null) {
			head=null;
			tail=null;
		}
		
		head = head.next;
		size--;
	}
	
	public void deleteLast() {
		if(size<=1) {
			deleteFirst();
		}
		Node temp = head.next;
		Node prev = head;
		while(temp.next!=null) {
			prev = temp;
			temp= temp.next;
		}
		prev.next=null;
		size--;
	}
	
	public void delete(int idx) {
		Node temp = head;
		for (int i = 0; i < idx-1; i++) {
			temp = temp.next;
		}
		temp.next= temp.next.next;
		size--;
	}
	
	public void find(int val) {
		Node temp = head;
		int i =0;
		while(temp.value!=val) {
			temp = temp.next;
			i++;
		}
		if(temp.value==val) {
			System.out.println(i);
		}
		else {
			System.out.println("-1");
		}
	}
	
	public void insertRec(int val,int index) {
		head = insertRec(val, index, head);
	}
	private Node insertRec(int val,int idx, Node node) {
		if(idx==0) {
			Node temp = new Node(val,node);
			size++;
			return temp;
		}
		node.next = insertRec(val, idx-1, node.next);
		return node;
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value= value;
		}
		public Node(int value,Node next) {
			this.value=value;
			this.next = next;
		}
	}
}
