package collection;

import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args)
	{
		LinkedHashSet lhs=new LinkedHashSet();
		
               //Adding elements//
		
		lhs.add("Black");
		lhs.add(5);
		lhs.add(7.6);
		lhs.add("A");
		lhs.add("null");
	System.out.println(lhs);
	System.out.println(lhs.size());
	    lhs.add("red");
	}

}
