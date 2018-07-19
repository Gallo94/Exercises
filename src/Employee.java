import java.text.DecimalFormat;

public class Employee implements Measurable
{
	
	private double salary;
	private String name;
	
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public double getMeasure()
	{
		return salary;
	}
	
	public static Measurable largest(Measurable[] objs)
	{
		Employee employee = (Employee) objs[0];
		for(int i=1; i<objs.length; i++)
		{
			Employee other = (Employee) objs[i];
			if (employee.getMeasure() < other.getMeasure())
				employee = other;
		}
		return employee;
		
	}
	
	public static double avarage(Measurable[] objs)
	{
		double salarySum = 0.0f;
		for(int i=0; i< objs.length; i++)
		{
			Employee employee = (Employee) objs[i];
			salarySum += employee.getMeasure();
		}
		return (salarySum/objs.length);
	}
	
	public static void main(String args[])
	{
		Employee[] employes = {
				new Employee("Luca", 1.90f),
				new Employee("Michele", 34.60f),
				new Employee("Paolo", 56.30f),
		};
		double avarage = Employee.avarage(employes);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Avarage salary: " + df.format(avarage) + "$");
		
		Employee xl = (Employee) Employee.largest(employes);
		
		System.out.println("Max Salary: " + xl.getName());
	}
}
