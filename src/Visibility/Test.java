package Visibility;

import java.util.function.Function;

public class Test {

	Function<? super ClassA, Integer> f;
	
	public Test()
	{
		f = new Function<ClassC, Integer>() {};
	}
}
