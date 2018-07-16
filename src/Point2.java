public class Point2 
{
	private float x;
	private float y;

	public Point2(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point2()
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
	
	public void translate(float x, float y)
	{
		this.x+=x; 
		this.y+=y;
	}
	
	public void scale(float scale)
	{
		this.x*=scale;
		this.y*=scale;
	}
	
	@Override
	public String toString()
	{
		return "[" + x + ", " + y + "]" ;
	}
	
	public static void main (String args[])
	{
		Point point = new Point(3,4);
		Point point1 = point.translate(1, 3);
		Point point2 = point1.scale(0.5f);
		System.out.println(point2);
	}
}