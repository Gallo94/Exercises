/**
 * Write a program that reads a two-dimensional array of integers and determines
 * whether it is a magic square (that is, whether the sum of all rows, all columns
 * and the diagonals is the same).
 * 
 * @author Luca
 */
public class BidimensionalArray
{
	private int[][] matrix =
	{
			{16, 3, 2, 13},
			{5, 10, 11, 8},
			{9, 6, 7, 12},
			{4, 15, 14, 1},
			
//			{16, 3, 1, 13},
//			{5, 10, 11, 8},
//			{9, 6, 7, 12},
//			{4, 15, 14, 0},
	};
	
	public int CheckSumCol (int col)
	{
		int sum=0;
		for (int row=0; row<4; row++)
		{
			sum += matrix[col][row];
		}
		return sum;
	}
	
	public int CheckSumRow (int row)
	{
		int sum=0;
		for (int col=0; col<4; col++)
		{
			sum += matrix[row][col];
		}
		return sum;
	}
	
	
	public int CheckSumDigMAX ()
	{
		int sum=0;
		for (int col=0; col<4; col++)
		{
			sum += matrix[col][col];
		}
		return sum;
	}
	
	public int CheckSumDigmin ()
	{
		int sum=0;
		for (int col=0; col<4; col++)
		{
			sum += matrix[4-col-1][col];
		}
		return sum;
	}
	
	public boolean CheckMagicSquare ()
	{
		return (CheckSumCol(0) == CheckSumCol(1) && CheckSumCol(2) == CheckSumCol(3) && CheckSumRow(0) == CheckSumRow(1) && CheckSumRow(2) == CheckSumRow(3));
	}
	
	public static void main (String args[])
	{
		BidimensionalArray bda = new BidimensionalArray();
		if (bda.CheckMagicSquare())
		{
			System.out.println("Yes, is Magic Sqaure");
		} else
		{
			System.out.println("NO");
		}
	}
}
