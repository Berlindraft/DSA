package stack;

public class DStack 
{
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push(int data) 
	{
		if(size() == capacity) 
		{expand();}
		
		stack[top] = data;
		top++;	
	}

	private void expand() {
		int length = size();
		int newStack[] = new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity = capacity * 2;
	}

	public void show() 
	{
		for(int n : stack) 
		{
			System.out.println(n + " ");
		}
		
	}

	public int pop() 
	{
		int data; 
		top--;
		data = stack[top];
		stack[top] = 0;
		return data;
	}
	
	public int peek() 
	{
		int data; 
		data = stack[top];
		return data;
	}
	
	public int size() 
	{
		return top;
		
	}
	
	public boolean isEmpty() 
	{
		return top<=0;
	}	

}