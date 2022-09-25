package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class doublylinkedlist {

	public static void main(String[] args)
	{
	LinkedList l=new LinkedList();
	l.add(100);
	l.add("USA");
	l.add(8.9);
	l.add("USA");
	l.add(null);
	l.add(200);
	System.out.println(l);
	
	System.out.println("----------");
l.add(1,"india");
System.out.println(l);
l.remove(2);
System.out.println(l);

System.out.println("----------");
//using iterator cursor//
Iterator i=l.iterator();
while(i.hasNext())
{
	System.out.print(i.next()+" ");
}
System.out.println("----------");

l.remove(4);
System.out.println(l);

	}
}

////using listiterator cursor//
//ListIterator li=l.listIterator();
//while(li.hasNext())
//{
//	System.out.print(li.next()+" ");
//	}
////using linkedlist
//LinkedList ll=new LinkedList();
//while(li.hasPrevious())
//{
//	System.out.print(li.previous()+" ");
//	}
//}
//
//
//}
