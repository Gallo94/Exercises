package ExercisesGeneric;

import java.lang.reflect.Array;

public class ArrayStack<E>
{
	E[] array;
	int current = 0;
	
	public ArrayStack(Class<E> clazz, int capacity)
	{
		array = (E[]) Array.newInstance(clazz, capacity);
	}
	
	public void push(E element)
	{
		if (current > array.length - 1)
		{
			E[] tempArr = (E[]) Array.newInstance(array.getClass().getComponentType(), array.length+1);
			System.arraycopy(array, 0, tempArr, 0, array.length);
			array = tempArr;
		}
		
		array[current] = element;
		current++;
	}
	
	@Override
	public String toString()
	{
		String string = new String();
		string += "[";
		for (int i = 0; i < array.length;i++)
		{
			string += array[i];
			string += i != array.length - 1 ? ", " : "";
		}
		string += "]";
		
		return string;
	}
}
