package stack;
import java.util.Stack;

public class declaredstack  // Stack Declaration..
{
	public static void main(String[] args)
	{
		Stack<String> stack=new Stack<String>();
		stack.push("H");
		stack.push("A");
		stack.push("R");
		stack.push("S");
		stack.push("H");
		printstack(stack);	
		
		System.out.println("Search Element in the stack..");
		System.out.println(stack.search("R"));
		
		stack.pop();
		System.out.println();
	}
		private static void printstack(Stack<String> s)
		{
			if(s.isEmpty())			
				System.out.println("You have nothing in the stack..");
			else
				System.out.println("Stack=" + s);
		}

		
		
		
}