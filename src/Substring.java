/**
 * Write a program that read a string and prints all of its nonempty substring
 * 
 * @author Luca
 */

import java.util.Scanner;

public class Substring
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Write a string: ");
		String str = in.nextLine();
		
		int count = 0;
		for (int i=0; i<str.length();i++)
		{
			for (int j=i+1; j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
				count++;
			}
		}
		System.out.println();
		System.out.println("Number occurences: " + count);
	}
}
