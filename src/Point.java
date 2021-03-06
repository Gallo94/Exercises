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
		Point point = new Point(3,4);
		Point point1 = point.translate(1, 3);
		Point point2 = point1.scale(0.5f);
		System.out.println(point2);
	}
}