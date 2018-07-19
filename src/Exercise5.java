/**
 * Exercise N°5, pag.200
 * Implmenta un metodo anaogo a System.out.println
 */
import java.io.IOException;
import java.io.OutputStream;

public class Exercise5
{
	public static void print(Object obj)
	{
		OutputStream os = System.out;
		byte[] bts = obj.toString().getBytes();
		try {
			os.write(bts);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		Object als = new Object();

		print(als);
	}
}
