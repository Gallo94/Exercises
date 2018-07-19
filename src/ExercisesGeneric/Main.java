package ExercisesGeneric;

public class Main
{
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(3);
		stack.push(8);
		stack.push(15);
		stack.pop();
		System.out.println(stack);
	}
}
