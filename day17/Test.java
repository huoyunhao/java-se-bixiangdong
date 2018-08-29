import java.util.*;
class  Test
{
	public static void main(String[] args) 
	{
		ArrayList<? extends Person> al = new ArrayList<Student>();
		
	}
}
/*
class Person
{
	chifan();
}
class Student extends Person
{
	study()
}
class worker extends Person
{
	work()
}
*/

/*
public static void printColl(ArrayList<? extends Person> al)
{
	Iteator<? extends Person> it = al.iterator()'
	it.next().study();
}


TreeSet ts = new TreeSet();
ts.add(new Demo(5));
ts.add(new Demo(9));//new Demo(9).compareTo(new Demo(5));
new Demo(3).compareTo(new Demo(4));// 正数  负数  0.

class Demo implements Comparable
{
	public int compareTo(Object obj)
	{
		Demo d = (Demo)obj;

		return -1;
	}
}

class DemoCompare implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		return 1;
	}
}




class Tool<T>
{
	void show(T t)
	{
	
	}

	static <W> void show2(W t)
	{
	
	}

	<Q> void show3(Q q)
	{
		
	}
}

<?>

? extends T : 接收T类型或者T的子类型
？ super T: 接收T类型或者T的父类型。



*/
