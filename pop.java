package stack;
import java.util.Scanner;
import java.util.Stack;
public class pop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) 
			stack.push(input.next());
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		System.out.println();
	}
}