import java.util.Scanner;

public class Palindrome
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Insert a word: ");
		String string = in.nextLine();
		boolean palindrome = true;
		for(int i=0; i<string.length(); i++)
		{
			if(string.charAt(i) != (string.charAt(string.length()-i-1)))
			{
				palindrome = false;
			}
		}
		System.out.println(palindrome ? "palidrome" : "not palindrome");
	}
}
