package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class listinterface {

	public static void main(String[] args) 
	{
		
ArrayList a=new ArrayList();
a.add(200);
a.add("Hello");
a.add(null);
a.add(7.5);
a.add(200);
System.out.println(a);

//add element ojas in index 1
//a.add(1,"ojas");
//System.out.println(a);
//System.out.println("---------------------------------");
//ArrayList al=new ArrayList();
//al.add(22);
//al.add("hi");
//al.add(null);
//al.add("Priya");
//al.add(22);
//a.addAll(al);
//System.out.println(a);
//System.out.println("---------------------------------");
//a.addAll(4, al);
//System.out.println(a);
////delete elemnt
//a.remove(2);
//System.out.println(a);
//a.set(3,49);
//System.out.println(a);
//System.out.println("---------------------------------");
//System.out.println(a.size());

//for(Object o:a)
//{
//	System.out.print(o);
//}

System.out.println("---------------------------------");

for(int i=0;i<=a.size()-1;i++)
{
	System.out.println(a.get(i));
}
System.out.println("---------------------------------");
	Iterator s=a.iterator();
	
	while(s.hasNext())
	{
		System.out.println(s.next());
	}
		System.out.println("---------------------------------");
		
		ListIterator l=a.listIterator();
		
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}	
		boolean result=a.contains("Hello");
		System.out.println(result);
	}
	
	

}
