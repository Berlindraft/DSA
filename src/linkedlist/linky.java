package linkedlist;

public class linky {

	public static void main(String[] args) {
		// main function to call in the linked list object
		LinkedList list = new LinkedList();
		// insert method
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.insert(20);
		list.insertAtStart(12);
		list.insertAt(2, 7);
		list.deleteAt(3);
		// show method
		list.show();
	}
	
}
