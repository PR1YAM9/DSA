package LinkedListBasics;

public class Main {

	public static void main(String[] args) {
		LL list = new LL();
		list.insertFirst(0);
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertLast(3);
		list.insertLast(4);
//		list.insert(10, 1);
		list.display();
//		System.out.println();
//		list.deleteFirst();
//		list.deleteLast();
//		list.delete(2);
//		list.find(0);
//		list.display();
		
		
//		DLL list = new DLL();
//		list.insertFirst(0);
//		list.insertFirst(1);
//		list.insertFirst(2);
		
		
		list.insertRec(2,1);
		list.display(); 
		
		
	}

}
