import java.util.ArrayList;
import java.util.Random;

public class LotteryComb
{
	public static void main (String args[])
	{
		int len = 49;
		ArrayList<Integer> lot = new ArrayList<>();
		for(int i=1; i<=len; i++)
		{
			lot.add(i);
		}
		
		Random random = new Random();
		
		for (int j=0; j<6; j++)
		{
			System.out.println("Estrazione N°: " + j);
			ArrayList<Integer> sorted = new ArrayList<>();
			for (int i=0; i<6; i++)
			{
				int index = random.nextInt(lot.size());
				int value = lot.remove(index);
				sorted.add(value);
			}
			/** Lambda Expression */
			sorted.sort((x,y) -> (x-y));
			
			/** Functional Interface */
//			sorted.sort(new Comparator<Integer>() {
//				@Override
//				public int compare(Integer x, Integer y) {
//					return x - y;
//				}
//			});
			System.out.println(sorted);
			
		}
	}
}
