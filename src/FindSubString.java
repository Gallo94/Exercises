import java.util.Scanner;

public class FindSubString
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insert the word: ");
		String str = in.nextLine();
		
		for (int i=0; i<str.length(); i++)
			for (int j=i+1; j<str.length(); j++)
				System.out.println(str.substring(i, j));
				
	}
	
}
