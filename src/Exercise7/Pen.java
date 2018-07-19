package Exercise7;

public class Pen implements Weightable
{
	private String name;
	private double weight;
	
	public Pen(final String name, final double weight)
	{
		this.name = name;
		this.weight = weight;
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
	
}
