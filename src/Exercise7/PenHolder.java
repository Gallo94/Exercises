/**
 * Ci sono diversi oggetti sulla scrivania, come forbici, penne, matite, gomme
 * ed un portapenne. Scrivere una classe che rappresenti ciascun oggetto e scrivere
 *  un metodo che calcoli il peso del portapenne qualora contenga tutti gli oggetti sulla scrivania.
 * Exercise N°7, pag. 228
 */
package Exercise7;

import java.util.ArrayList;

public class PenHolder implements Weightable
{
	private double weight;
	private String name;
	private ArrayList<Weightable> weightables;
	
	public PenHolder(String name, double weight)
	{
		this.name = name;
		this.weight = weight;
		weightables = new ArrayList<>();
	}
	
	@Override
	public double getWeight()
	{
		return weight;
	}
	public String getName()
	{
		return name;
	}
	
	
	
	public double SumWeightables(ArrayList<Weightable> weightables)
	{
		double sum = 0;
		
		// Remove penholder istances
		for (int i=0; i<weightables.size(); i++)
		{
			if (weightables.get(i) instanceof PenHolder)
			{
				weightables.remove(i);
				i--;
			}
		}
		
		// Sum weights
		for (int i=0; i<weightables.size(); i++)
		{
			sum += weightables.get(i).getWeight();
		}
		return sum + weight;
	}
	
}
