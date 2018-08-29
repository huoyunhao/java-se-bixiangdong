
/*
异常：就是程序在运行时出现不正常情况。
异常由来：问题也是现实生活中一个具体的事物，也可以通过java的类的形式进行描述。并封装成对象。
			其实就是java对不正常情况进行描述后的对象体现。

对于问题的划分：两种：一种是严重的问题，一种非严重的问题。

对于严重的，java通过Error类进行描述。
	对于Error一般不编写针对性的代码对其进行处理。

对与非严重的，java通过Exception类进行描述。
	对于Exception可以使用针对性的处理方式进行处理。

无论Error或者Exception都具有一些共性内容。
比如：不正常情况的信息，引发原因等。

Throwable
	|--Error
	|--Exception




2,异常的处理

java 提供了特有的语句进行处理。
try
{
	需要被检测的代码；
}
catch(异常类 变量)
{
	处理异常的代码；(处理方式)
}
finally
{
	一定会执行的语句；
}


3，对捕获到的异常对象进行常见方法操作。
	String getMessage()：获取异常信息。


在函数上声明异常。
便于提高安全性，让调用出进行处理。不处理编译失败。

*/

class Demo
{
	int div(int a,int b)throws Exception//在功能上通过throws的关键字声明了该功能有可能会出现问题。
	{
		return a/b;
	}
}


class  ExceptionDemo1
{
	public static void main(String[] args) //throws Exception
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,0);
			System.out.println("x="+x);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		

		System.out.println("over");

	}
}
