import java.util.Scanner;

public class Test1
{
	public static void main (String args[])
	{
		
		Scanner in = new Scanner(System.in);
		while (true)
		{
			System.out.print("Integer: ");
			Integer dec = in.nextInt();
			System.out.println("Binary: " + Integer.toBinaryString(dec));
			System.out.println("Octal: " + Integer.toOctalString(dec));
			System.out.println("Hexadecimal: " + Integer.toHexString(dec));
			System.out.println("Reciprocal: " + Math.pow(Double.parseDouble(Integer.toHexString(dec)), (double)-1));
			
			System.out.println();
			
			System.out.print("Integer angle: ");
			Integer angle = in.nextInt();
			if ( angle < 360 && angle > 0)
			{
				System.out.println("This angle is ok!");
			}
			
			System.out.println();
			
			System.out.print("Integer1: ");
			Integer int1 = in.nextInt();
			System.out.print("Integer2: ");
			Integer int2 = in.nextInt();
			System.out.print("Integer3: ");
			Integer int3 = in.nextInt();
			System.out.println("Max is: " + Math.max(Math.max(int1, int2), int3));
			
			System.out.println();			
		}
	}
}
