class  Demo
{

	Demo(int x)
	{}
	void show()
	{}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Demo d = new Demo(4);
		d.show();
		d.show();

		Phone p = new Phone();
		p.setNumber(88888888);


	}
}

class Phone
{
	int number;
	Phone()
	{
		number = 51552112;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
}



/*
1，java语法(变量，语句，函数，数组)，
2，面向对象(类和对象的关系，封装（机箱故事），继承，多态，构造函数，this，static，内部类，抽象类，接口)
3，多线程。
4，JavaApi（其实就是java给我们提供的已经定义好的对象。工具对象：集合框架）
5，输入输出(IO)
6，java的图形界面。--事件监听机制。
7，网络通讯。Socket

web基础知识：
1，HTML。
2，CSS
3，JavaScript
4，DOM。

*/