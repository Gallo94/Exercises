package Exercise7;
import java.util.ArrayList;

public class Main
{
	public static void main(String args[])
	{
		Pen pen = new Pen("penna1", 0.8);
		Pencil pencil = new Pencil("matita", 0.3);
		PenHolder penholder = new PenHolder("porta penne", 2.0);
		PenHolder penholderXL = new PenHolder("porta penne", 5.0);
		
		ArrayList<Weightable> weightables = new ArrayList<>();
		weightables.add(pencil);
		weightables.add(pen);
		weightables.add(penholder);
		weightables.add(penholderXL);
		
		System.out.println("Weight = " + penholder.SumWeightables(weightables));
	}
}
