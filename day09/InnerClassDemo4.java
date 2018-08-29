/*	
匿名内部类:
1，匿名内部类其实就是内部类的简写格式。
2，定义匿名内部类的前提：
	内部类必须是继承一个类或者实现接口。
3，匿名内部类的格式：  new 父类或者接口(){定义子类的内容}
4，其实匿名内部类就是一个匿名子类对象。而且这个对象有点胖。	可以理解为带内容的对象。
5，匿名内部类中定义的方法最好不要超过3个。


*/
abstract class AbsDemo
{
	abstract void show();
	
}


class Outer
{
	int x = 3;

	/*
	class Inner extends AbsDemo
	{
		int num = 90;
		void show()
		{
			System.out.println("show :"+num);
		}
		void abc()
		{
			System.out.println("hehe");
		}
	}
	*/

	public void function()
	{
		//AbsDemo a = new Inner();
//		Inner in = new Inner();
//		in.show();
//		in.abc();
	

		AbsDemo d = new AbsDemo()
		{
			int num = 9;
			void show()
			{
				System.out.println("num==="+num);
			}
			void abc()
			{
				System.out.println("haha");
			}
		};

		d.show();
		//d.abc();//编译失败;

		



	}
}



class InnerClassDemo4 
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}


