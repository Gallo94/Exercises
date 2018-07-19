/** Exercise N°4, pag. 200
 *	Un array conterrà istanze di oggetti di classi diverse e scrivere un metodo
 *	in grado di visualizzarne il contenuto. 
 */
public class Exercise4
{
	public static class ClassA {}
	public static class ClassB {}
	
	public static void main(String args[])
	{
		Object[] obj = new Object[5];
		obj[0] = new Thread();
		obj[1] = new ClassA();
		obj[2] = new ClassB();
		printArray(obj);
	}
	
	public static void printArray(Object[] obj)
	{
		for (int i=0; i<obj.length; i++)
		{
			System.out.println(obj[i]);			
		}
	}
}