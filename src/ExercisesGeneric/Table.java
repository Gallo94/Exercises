package ExercisesGeneric;

import java.util.ArrayList;

public class Table<K, V>
{
	
	ArrayList<Entry<K, V>> list;
	
	public Table()
	{
		list = new ArrayList<>();
	}
	
	public V getValue(K key)
	{
		for(int i=0; i<list.size(); i++)
		{
			Entry<K, V> entrylist = list.get(i);
			
			if (entrylist.getKey() == key)
				return entrylist.getValue();
		}
		return null;
	}
	
	public void addEntry(Entry<K, V> e)
	{
		for(int i=0; i<list.size(); i++)
		{
			Entry<K, V> listE = list.get(i);
			if (listE.getKey() == e.getKey())
			{
				listE.setValue(e.getValue());
				return;
			}
		}
		list.add(e);
	}
	
	public void removeEntry(K key)
	{
		for(int i=0; i<list.size(); i++)
		{
			Entry<K, V> listE = list.get(i);
			if(listE.getKey() == key)
			{
				list.remove(i);
			}
		}
	}
	
	@Override
	public String toString()
	{
		return list.toString();
	}

}