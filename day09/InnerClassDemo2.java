/*
内部类的访问规则：
1，内部类可以直接访问外部类中的成员，包括私有。
	之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用，格式 外部类名.this
2，外部类要访问内部类，必须建立内部类对象。

访问格式：
1,当内部类定义在外部类的成员位置上，而且非私有，可以在外部其他类中。
可以直接建立内部类对象。
格式
	外部类名.内部类名  变量名 = 外部类对象.内部类对象;
	Outer.Inner in = new Outer().new Inner();

2,当内部类在成员位置上，就可以被成员修饰符所修饰。
	比如，private：将内部类在外部类中进行封装。
		static:内部类就具备static的特性。
		当内部类被static修饰后，只能直接访问外部类中的static成员。出现了访问局限。

		在外部其他类中，如何直接访问static内部类的非静态成员呢？
		new Outer.Inner().function();

		在外部其他类中，如何直接访问static内部类的静态成员呢？
		uter.Inner.function();

	注意：当内部类中定义了静态成员，该内部类必须是static的。
		  当外部类中的静态方法访问内部类时，内部类也必须是static的。



	
当描述事物时，事物的内部还有事物，该事物用内部类来描述。
因为内部事务在使用外部事物的内容。

class Body
{
	private class XinZang
	{

	}

	public void show()
	{
		new XinZang().
	}
	
}





*/
class Outer
{
	private static  int x = 3;

	
	static class Inner//静态内部类
	{
		static void function()
		{
			System.out.println("innner :"+x);
		}
	}

	static class Inner2
	{
		void show()
		{
			System.out.println("inner2 show");
		}
	}

	public static void method()
	{
		//Inner.function();
		new Inner2().show();
	}

}


class  InnerClassDemo2
{
	public static void main(String[] args) 
	{
		Outer.method();
		//Outer.Inner.function();
		//new Outer.Inner().function();
		//直接访问内部类中的成员。
//		Outer.Inner in = new Outer().new Inner();
//		in.function();
	}
}
