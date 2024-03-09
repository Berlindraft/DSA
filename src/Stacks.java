//import stack
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// create stack object
		Stack<String> stack = new Stack<String>();
		//push, pop, peek, empty, search
		//System.out.println(stack.empty());
		
		stack.push("raymund");
		stack.push("zyron");
		stack.push("abella");
		//[raymund, zyron, abella]

		String last_name = stack.pop();
		//[raymund, zyron]
		//pop returns the last object making it assignable
		//instead of pop you can peek to see the top of the stack
		System.out.println(last_name);
		System.out.println(stack);

	}

}
