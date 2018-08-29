
/*
StaticImport  静态导入。

当类名重名时，需要指定具体的包名。
当方法重名是，指定具备所属的对象或者类。
*/

import java.util.*;
import static  java.util.Arrays.*;//导入的是Arrays这个类中的所有静态成员。
import static java.util.Collections.*;
/*
packa/Demo.class 
packb/Demo.class

import packa.*;
import packb.*;
*/

import static  java.lang.System.*;//导入了System类中所有静态成员。

class  StaticImport //extends Object
{
	public static void main(String[] args) 
	{

		out.println("haha");
		int[] arr = {3,1,5};

		sort(arr);
		int index = binarySearch(arr,1);
		out.println(Arrays.toString(arr));
		System.out.println("Index="+index);

		ArrayList al = new ArrayList();
		al.add(1);
		al.add(3);
		al.add(2);

		out.println(al);

		sort(al);
		out.println(al);
	}
}
