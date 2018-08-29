import java.util.*;

/*
去除ArrayList集合中的重复元素。

*/

class ArrayListTest 
{

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java02");
		al.add("java01");
//		al.add("java03");


		/*
		在迭代时循环中next调用一次，就要hasNext判断一次。
		Iterator it = al.iterator();

		while(it.hasNext())
		{
			sop(it.next()+"...."+it.next());
		}
		*/

		/**/
		sop(al);
		
		al = singleElement(al);

		sop(al);
		

	}

	public static ArrayList singleElement(ArrayList al)
	{
		//定义一个临时容器。
		ArrayList newAl = new ArrayList();

		Iterator it = al.iterator();

		while(it.hasNext())
		{
			Object obj = it.next();

			if(!newAl.contains(obj))
				newAl.add(obj);

		}

		return newAl;
	}
}
