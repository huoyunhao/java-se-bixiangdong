class OperateDemo2 
{
	public static void main(String[] args) 
	{

		int x  = 7;

		//逻辑运算符用于连接boolean类型的表达式。

		//x>3 & x<6 = true & true = true;
		/*
		true & true = true;
		true & false = false;
		false & true = false;
		false & false = false;

		& : 只要两边的boolean表达式结果，有一个为false。那么结果就是false。
			只有两边都为true，结果为true。
		*/
		/*
		true | true = true;
		true | false = true;
		false | true = true;
		false | false = false;
		| : 两边只要有一个为true，结果为true。
			只有两边都有false，结果为false。
		*/

		/*
		^ : 异或；就是和|有点不一样。当true ^ true = false;
		true ^ true = false;
		true ^ false = true;
		false ^ true = true;
		false ^ false = false;
		^ : 两边相同结果是false。
			两边不同结果是true。

		*/

		/*
		!!true
		*/

		
		int a = 2;

		//a>3 && a<6;

		/*
		&和&&的特点：
		&:无论左边是true是false。右边都运算。
		&&:当左边为false时，右边不运算。


		|：两边都参与运算。
		||：当左边为true。右边不运算。
		*/



		System.out.println(false ^ false);
		System.out.println(~6);


		int n = 3,m = 8;
		System.out.println("n="+n+",m="+m);
		
		//1,通过第三方变量。
		/*int temp;
		temp = n;
		n = m;
		m = temp;
		*/

		//2不用第三方变量。
		//11 = 3 +  8;

		//3 = 11 - 8;
		//8 = 11 - 3;
		/*
		n = n + m;//如果n和m的值非常大，容易超出int范围。
		m = n - m;
		n = n - m;
		*/

		n = n ^ m;

		m = n ^ m;//(n^m)^m;

		n = n ^ m;//n ^ (n ^ m)

		System.out.println("n="+n+",m="+m);
	}
}
