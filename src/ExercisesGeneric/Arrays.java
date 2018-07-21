package ExercisesGeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;


public class Arrays
{
	
	public static class PairMinMax<T>
	{
		T min;
		T max;
		
		
		public PairMinMax(final T min, final T max)
		{
			this.min=min;
			this.max=max;
		}
		
		public String toString()
		{
			return "[" + min + ", " + max + "]";
		}
	}
	
	
	public static class InnerObject
	{
		String name;
		int id;
		int age;
		
		public InnerObject(final String name, final int id, final int age)
		{
			this.name = name;
			this.id   = id;
			this.age  = age;
		}
		
		public String toString()
		{
			return this.name;
		}
	}
	
	public static <T> PairMinMax<T> MiniMax(Collection<? extends T> data, Comparator<? super T> comp)
	{
		T min = min(data, comp);
		T max = max(data, comp);
		return new PairMinMax<T>(min, max);
	}
	
	public static <T> void MiniMax(List<T> data, Comparator<? super T> comp, List<? super T> result)
	{
		T min = min(data, comp);
		T max = max(data, comp);
		result.add(min);
		result.add(max);
	}
	
	
	public static <T> T min(Collection<? extends T> data, Comparator<? super T> comp)
	{
		T element = data.iterator().next();
		
		for (T other : data)
		{
			if (comp.compare(element, other) > 0)
				element = other;
		}
		
		return element;
	}
	
	public static <T> T max(Collection<? extends T> data, Comparator<? super T> comp)
	{
		T element = data.iterator().next();

		for (T other : data)
		{
			if (comp.compare(element, other) < 0)
				element = other;
		}
		
		return element;
	}
	
	public static void main(String[] args)
	{
		ArrayList<InnerObject> integers = new ArrayList<>();
		integers.add(new InnerObject("asd", 0, 26));
		integers.add(new InnerObject("rofl", 1, 14));
		integers.add(new InnerObject("lol", 2, 54));
		integers.add(new InnerObject("jez", 3, 2));
		integers.add(new InnerObject("ezpez", 4, 80));
		integers.add(new InnerObject("wtf", 5, 99));
		
		System.out.println(Arrays.min(integers, (x, y) -> x.age - y.age));
		System.out.println(Arrays.max(integers, (x, y) -> x.age - y.age));
		System.out.println(Arrays.MiniMax(integers, (x, y) -> x.age - y.age));
		
		ArrayList<Object> result = new ArrayList<>();
		Arrays.MiniMax(integers, (x, y) -> x.age - y.age, result);
		System.out.println(result);
	}
}