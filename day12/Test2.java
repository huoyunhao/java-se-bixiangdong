class test_parent
{
	int x = 5;
	int y = 10;
	void set_value(int a, int b)
	{
		x = a;
		y = b;
	}
	int get_1()
	{
		return this.x + this.y;
	}
	int get_2()
	{
		return x - y;
	}
}

class test_4 extends test_parent
{
	int y;
	test_4(int a)
	{
		y = a;
	}
	void set_value(int a, int b)
	{
		x = a;
		y = b;
	}
	int get_2()
	{
		return y;
	}
}

class  Test2
{
	public static void main(String[] args) 
	{
		test_4  a1=new test_4(1);
		int x = a1.get_1();
		System.out.println("x="+x);
	}
}
/*

如果用下面几种不同的方法加载类，写出要求的结果：
    (3) 用  test_4  a1=new test_4(1) 后；a1.get_1()的内容为_____ 。
	(4) 用  test_4  a1=new test_4(－1) ；a1.set _value(5,5) 后；a1.get_2()的内容为
_____。

*/