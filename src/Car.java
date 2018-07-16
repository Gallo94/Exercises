public class Car
{
	private float x;
	private float fuel_efficency;
	private float fuel_level=100;
	
	public Car(float fuel_level, float fuel_efficency)
	{
		// Init position
		this.x = 0;
		this.fuel_level = fuel_level;
		this.fuel_efficency = fuel_efficency;
	}
	
	public void Drive(float x)
	{
		if (fuel_level <= 0)
		{
			System.out.println("Fuel exhausted");
			return;
		}
		this.x += x;
		this.fuel_level -= x*fuel_efficency;
		System.out.println("Good driver");
	}
	
	public void addGallons(float gal)
	{
		this.fuel_level += gal;
		if (fuel_level >= 100)
			fuel_level = 100;
	}
	
	public float getDistance()
	{
		return Math.abs(this.x);
	}
	
	public float getFuelLevel()
	{
		return this.fuel_level;
	}
	
	public static void main(String args[])
	{
		Car car = new Car(40.0f, 1.0f);
		car.Drive(40.0f);
		car.Drive(1.0f);
		car.addGallons(100.0f);
		car.Drive(100.0f);
		car.Drive(1.0f);
		
	}
}