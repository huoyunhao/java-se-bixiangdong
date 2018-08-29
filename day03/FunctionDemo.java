class FunctionDemo 
{
	

	public static void main(String[] args) 
	{
		/*
		int x = 4;
		System.out.println(x*3+5);

		x = 6;

		System.out.println(x*3+5);
		*/
		//int y = 4*3+5;
		//int z = 6*3+5;

		//int x = getResult(4);
		//System.out.println("x="+x);
		//int y = getResult(6);

		getResult(5);

	}

	//发现以上的运算，因为获取不同数据的运算结果，代码出现了重复。
	//为了提高代码的复用性。对代码进行抽取。
	//将这个部分定义成一个独立的功能。方便与日后使用。
	//java中对功能的定义是通过函数的形式来体现的。

	//需要定义功能，完成一个整数的*3+5的运算，

	//1,先明确函数定义的格式。
	/*

	修饰符 返回值类型 函数名(参数类型 形式参数1，参数类型 形式参数2，)
	{
			执行语句;
			return 返回值;
	}
	
	//当函数运算后，没有具体的返回值时，这是返回值类型用一个特殊的关键字来标识。
	//该关键字就是void。void:代表的是函数没有具体返回值的情况。
	//当函数的返回值类型是void时，函数中的return语句可以省略不写。
	*/
	public static void getResult(int num)
	{
		System.out.println(num * 3 + 5);
		return;//可以省略
	}
	


}
