package ExercisesInheritance;

public class Main
{
	public static void main(String args[])
	{
		LabeledPoint lp = new LabeledPoint("caio", 3.0, 3.2);
		LabeledPoint lp1 = new LabeledPoint("ciaone", 3.0, 3.2);
		System.out.println(lp.toString());
		System.out.println(lp.equals(lp1));
		System.out.println(lp.hashCode());
		
		Point point = new Point(1.0, 0.5);
		Point point2 = new Point(2.0, 6);
		
		Circle circle = new Circle(point, 6);
		System.out.println(circle.getCenter());
		
		Rectangle rect = new Rectangle(point, 3.0, 12);
		System.out.println(rect.getCenter());
		
		Line line = new Line(point, point2);
		System.out.println(line.getCenter());
		
	}
}