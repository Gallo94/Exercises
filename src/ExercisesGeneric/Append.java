package ExercisesGeneric;

import java.util.ArrayList;

public class Append<E>
{
	ArrayList<Object> list;
	
	public Append()
	{
		list = new ArrayList<>();
	}
	
	public void extAppend(ArrayList<? extends E> l1)
	{
		list.addAll(l1);
	}
	
	public void supAppend(ArrayList<? super E> l1)
	{
		list.addAll(l1);
	}
	
	public String toString()
	{
		return list.toString();
	}
}
