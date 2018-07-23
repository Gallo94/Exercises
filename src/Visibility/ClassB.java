package Visibility;

public class ClassB
{
	public static void main(String args[])
	{	
		ClassA s = new ClassA("uno");
		System.out.println(s.str1 + " is visibile");
		System.out.println(s.str2 + " is visibile");
	}
}
