import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LuckySorting
{
	void luckySort(ArrayList<String> strings, Comparator<String> comparator)
	  {
	    while (!strings.stream().sorted(comparator).collect(Collectors.toList()).equals(strings))
	    {
	      Collections.shuffle(strings);
	      System.out.println(strings);
	    }
	  }
	
	public static void main(String args[])
	{
		LuckySorting ls = new LuckySorting();
		ArrayList<String> al = new ArrayList<String>();
		al.add("ciaone");
		al.add("zorro");
		al.add("alba");
		al.add("gatto");
		
		ls.luckySort(al, (a, b) -> a.compareTo(b));
	}
}