package Visibility;

import java.util.ArrayList;
import java.util.List;

public class ClassA
{
	private String str;
	protected String str1;
	public String str2;
	
	public ClassA(String s)
	{
		str = s;
		str1 = new String("protected");
		str2 = new String("public");
		
		List<String> ls = new ArrayList<>();
		List<Object> lo = new ArrayList<>();
		checkCollection(ls);
		
	}
	
	public void checkCollection(List<Object> list)
	{
		// do staff on collections
	}
}