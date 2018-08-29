
import java.util.*;
/*
? 通配符。也可以理解为占位符。
泛型的限定；
？ extends E: 可以接收E类型或者E的子类型。上限。
？ super E: 可以接收E类型或者E的父类型。下限

*/


class  GenericDemo6
{
	public static void main(String[] args) 
	{
		/*
		ArrayList<String> al = new ArrayList<String>();

		al.add("abc1");
		al.add("abc2");
		al.add("abc3");

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(4);
		al1.add(7);
		al1.add(1);

		printColl(al);
		printColl(al1);
		*/

		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("abc1"));
		al.add(new Person("abc2"));
		al.add(new Person("abc3"));
		//printColl(al);

		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(new Student("abc--1"));
		al1.add(new Student("abc--2"));
		al1.add(new Student("abc--3"));
		printColl(al1);  //ArrayList<? extends Person> al = new ArrayList<Student>();error

	}
	public static void printColl(Collection<? extends Person> al)
	{
		Iterator<? extends Person> it = al.iterator();


		while(it.hasNext())
		{
			System.out.println(it.next().getName());
		}
	}
	/*
	public static void printColl(ArrayList<?> al)//ArrayList al = new ArrayList<Integer>();error
	{
		Iterator<?> it = al.iterator();


		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
	}
	*/
}

class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}

class Student extends Person
{
	Student(String name)
	{
		super(name);
	}

}


/*

class Student implements Comparable<Person>//<? super E>
{
	public int compareTo(Person s)
	{
		this.getName()
	}
}
*/
class Comp implements Comparator<Person>
{
	public int compare(Person s1,Person s2)
	{

		//Person s1 = new Student("abc1");
		return s1.getName().compareTo(s2.getName());
	}
}

TreeSet<Student> ts = new TreeSet<Student>(new Comp());
ts.add(new Student("abc1"));
ts.add(new Student("abc2"));
ts.add(new Student("abc3"));


