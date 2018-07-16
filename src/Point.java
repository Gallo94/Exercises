/**
 * Implements an immutable class Point that describes a point in the plane.
 * Provide a constructor to set it to a specific point, a no-arg constructor to set
 * it to the origin, and methods getX, getY, translate, and scale.
 * 
 * @author Luca
 */
public class Point
{
	private float x;
	private float y;

	public Point(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point()
	{
		this.x = 0.0f;
		this.y = 0.0f;
	}
	
	public float getX()
	{
		return this.x;
	}
	
	public float getY()
	{
		return this.y;
	}
	
	public Point translate(float x, float y)
	{
		Point point = new Point(this.x+x, this.y+y);
		return point;
	}
	
	public Point scale(float scale)
	{
		Point point = new Point(this.x*scale, this.y*scale);
		return point;
	}
	
	@Override
	public String toString()
	{
		return "[" + x + ", " + y + "]" ;
	}
	
	public static void main (String args[])
	{
		Point point = new Point(3,4).translate(1, 3).scale(0.5f);
		System.out.println(point);
	}
}