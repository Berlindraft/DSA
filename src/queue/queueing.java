package queue;

public class queueing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(10);
		q.enQueue(15);
		
		q.deQueue();
		
		q.show();
		
		
	}

}
