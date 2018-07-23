package Visibility;

public class ClassDOut
{
	
	public int a = 10;
	
	// Dall'interno all'esterno � visibile (InnerClass)
	public class ClassDIn
	{
		private int b = 4;
		
		public void print()
		{
			System.out.println(a);
		}
	}
	
	// Dall'esterno all'interno non � visibile
	public void print()
	{
//		System.out.println(b); // Illegal!!
	}
}
