class IfDemo 
{
	public static void main(String[] args) 
	{
		int x = 1;

		if(x>1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("a");
		}
		
		/*
		if else 结构 简写格式： 变量 = (条件表达式)?表达式1：表达式2；
		
		三元运算符：
			好处：可以简化if else代码。
			弊端：因为是一个运算符，所以运算完必须要有一个结果。
		*/
		int a = 9,b;
		b = (a>1)?100:200;

		if(a>1)
			b = 100;
		else
			b = 200;


		int n = 3;

		if(n>1)
			System.out.println("a");
		else if(n>2)
			System.out.println("b");
		else if(n>3)
			System.out.println("c");
		else
			System.out.println("d");

		/*
		if(n>1)
			System.out.println("a");
		if(n>2)
			System.out.println("b");
		if(n>3)
			System.out.println("c");
		else
			System.out.println("d");
		*/
		System.out.println("over");
	}
}
