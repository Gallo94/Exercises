package ExercisesInheritance;

public class Point
{
	protected double x;
	protected double y;
	
	public Point(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	
	@Override
	public String toString()
	{
		return "[" + x + ", " + y + "]"; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
}
