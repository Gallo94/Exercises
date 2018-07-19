package ExercisesGeneric;

import java.util.ArrayList;

public class Stack<E>
{
	ArrayList<E> stack = new ArrayList<>();
	
	public void push(E e)
	{
		stack.add(0, e);
	}
	
	public E pop()
	{
		return stack.remove(0);
		
	}
	
	public boolean isEmpty()
	{
		return stack.isEmpty();
	}
	
	public String toString()
	{
		return stack.toString();
	}
}
