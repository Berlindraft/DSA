import java.util.Deque;
import java.util.LinkedList;

public class Queue {

	public static void main(String[] args) {
		// FIFO - first in first out
		//add - enqueue
		//remove - dequeue
		LinkedList<String> queue = new LinkedList<String>();	
		
		((Deque<String>) queue).offer("raymund");
		
		System.out.println(queue);
	
	}

}
