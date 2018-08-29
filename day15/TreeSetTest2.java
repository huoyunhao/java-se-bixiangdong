/*
"90 -7 0 18 2 45 4"

将字符串中的数值进行排序。使用TreeSet完成。

思路
1，将字符串切割。
2，可以将这些对象存入TreeSet集合。因为TreeSet自身具备排序功能。


*/
import java.util.*;
class TreeSetTest2 
{
	public static void main(String[] args) 
	{

		ArrayList al = new ArrayList();

		String str = "90 -7 0 18 2 45 4";

		String[] arr = str.split(" ");

		TreeSet ts = new TreeSet();

		for(int x=0; x<arr.length; x++)
		{
			//ts.add(new Integer(arr[x]));
			ts.add(Integer.parseInt(arr[x]));//
		}

		System.out.println(ts);
	}
}


