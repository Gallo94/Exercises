import java.util.Scanner;

public class Test1
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = in.nextLine();
		System.out.print("Et�: ");
		Integer age = in.nextInt();
		System.out.print("Grazie");
	}
}
