package Visibility;

public class ClassDOut
{
	
	public int a = 10;
	
	// Dall'interno all'esterno è visibile (InnerClass)
	public class ClassDIn
	{
		private int b = 4;
		
		public void print()
		{
			System.out.println(a);
		}
	}
	
	// Dall'esterno all'interno non è visibile
	public void print()
	{
//		System.out.println(b); // Illegal!!
	}
}
