/**
 * Exercise N°2, pag. 228
 * Implementa una classe generic in grado di contenere coppie di oggetti qualsiasi.
 */
public class Exercise2 <K, V>
{
	K key;
	V value;
	public Exercise2(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
	public V getValue()
	{
		return value;
	}
	public K getKey()
	{
		return key;
	}
	
	public static void main(String args[])
	{
		Exercise2<Integer, String> gp = new Exercise2<Integer, String>(24, "luca");
		Exercise2<Thread, Double> gp1 = new Exercise2<Thread, Double>(new Thread(), 0.0);
	}
	
}