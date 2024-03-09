package linkedlist;

public class LinkedList {
	//declare head variable/node
	Node head; 
	
	public void insert(int data) 
	{
		Node node = new Node(); //object creation
		node.data = data; //default values
		node.next = null; //default values
		
		//if the head node/ it doesn't contain any next number / it will become null
		if(head == null)  // checks if this is the first object
		{
			head = node; // head node is just node itself
		}
		else 
		{
			Node n = head; // points at the first node of the list
			 while(n.next != null) //until last node (which will be value null)
			 {
				 n = n.next;
				 // n = n.next is suppose to jumo between nodes
			 }
			 n.next = node; // cguro this is the same as head = node 
			 // this indicates that the last element is null
 
		}
		
	}
	public void show() 
	{
		Node node = head;
		while(node.next != null) 
		{
			System.out.println(node.data);
			node = node.next;
			
		}
		System.out.println(node.data);
	}
	
	public void insertAtStart(int data) 
	{
		Node node = new Node(); //object creation
		node.data = data; //default values
		node.next = null; //default values
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index, int data) 
	{
		Node node = new Node(); //object creation
		node.data = data; //default values
		node.next = null; //default values
		if(index == 0) 
		{
			insertAtStart(data);
		}
		else 
		{
		Node n = head;
		for(int i = 0; i < index -1; i++) 
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
	}
	
	public void deleteAt(int index) 
	{
		if(index == 0) 
		{
			head = head.next;
		}
		else 
		{
			Node n = head;
			Node n1 = null;
			for(int i = 0; i < index -1; i++) 
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("deleted:" + n1.data);
			n1 = null;
			
		}
	}
  
}
