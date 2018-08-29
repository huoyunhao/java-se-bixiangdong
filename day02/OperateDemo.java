class OperateDemo 
{
	public static void main(String[] args) 
	{
		//int x = 4270;

		//x = x /1000 * 1000;
		//System.out.println(-1%5);

		int a = 3,b;
		
		//a++; //--> a = a+ 1;
		

		b = ++a;
		
		System.out.println("a="+a);
		//字符串数据和任何数据使用+都是相连接，最终都会变成字符串。
		//System.out.println("5+5"+(5+5));//"5+5=55"
	

		/*
		转义字符：通过\ 来转变后面字母或者符号的含义。
		\n:换行。
		\b:退格。相当于backspace。
		\r:按下回车键。window系统，回车符是由两个字符来表示\r\n.
		\t:制表符。相当于tab键。
		*/
		System.out.println("hello \t world");
		//System.out.println("hello java");

		System.out.println("\\hello\\");
		
		char ch = '\'';

		char c = 'a';


	}
}
