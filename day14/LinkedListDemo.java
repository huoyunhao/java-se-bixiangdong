import java.util.*;

/*
LinkedList:特有方法：
addFirst();
addLast();

getFirst();
getLast();
获取元素，但不删除元素。如果集合中没有元素，会出现NoSuchElementException

removeFirst();
removeLast();
获取元素，但是元素被删除。如果集合中没有元素，会出现NoSuchElementException


在JDK1.6出现了替代方法。

offerFirst();
offerLast();


peekFirst();
peekLast();
获取元素，但不删除元素。如果集合中没有元素，会返回null。

pollFirst();
pollLast();
获取元素，但是元素被删除。如果集合中没有元素，会返回null。




*/

class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList link = new LinkedList();

		link.addLast("java01");
		link.addLast("java02");
		link.addLast("java03");
		link.addLast("java04");

		//sop(link);
//		sop(link.getFirst());
//		sop(link.getFirst());
		//sop(link.getLast());
		//sop(link.removeFirst());
		//sop(link.removeFirst());

		//sop("size="+link.size());

		while(!link.isEmpty())
		{
			sop(link.removeLast());
		}

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
/*

---
java01
java02
java03
java04

----
java04
java03
java02
java01
---
*/