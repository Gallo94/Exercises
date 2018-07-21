package ExercisesGeneric;

import java.util.ArrayList;

public class Main
{
	public static void main(String args[])
	{
		// Stack
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(3);
		stack.push(8);
		stack.push(15);
		stack.pop();
		System.out.println(stack);
		
		// Array
		ArrayStack<Integer> astack = new ArrayStack<>(Integer.class, 1);
		astack.push(4);
		astack.push(7);
		System.out.println(astack);
		
		// Table
		Table<String, Integer> table = new Table<>();
		table.addEntry(new Entry<String, Integer>("uno", 1));
		table.addEntry(new Entry<String, Integer>("due", 2));
		table.addEntry(new Entry<String, Integer>("tre", 3));
		table.addEntry(new Entry<String, Integer>("uno", 4));
		table.removeEntry("tre");
		System.out.println(table);
		
		// Append ArrayList Generics
		Append<Integer> ap = new Append<>();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(34);
		al.add(89);
		al.add(9);
		al.add(0);
		ap.extAppend(al);
		System.out.println(ap);

	}
}
