/*
1,获取1~10的和，并打印。

*/

class  ForTest2
{
	public static void main(String[] args) 
	{

		/*
	
		//1,定义变量用于存储不断变化的和。
		int sum = 0;

		//2，定义变量，记录住不断变化的被加的数。
		int x = 1;
		//3，定义循环，重复加法的过程。
		while(x<=10)
		{
			sum = sum + x;
			x++;

		}
		System.out.println("sum="+sum);

		*/
		/*
		循环注意：
		一定要明确哪些语句需要参与循环，哪些不需要。
		*/
		/*
	  0+1
		1+2
		 3+3
		   6+4
		   */
		//用for来体现。
		int sum = 0;

		for(int x=0; x<=10; x++)
		{
			sum += x;
			
		}
		System.out.println("for sum = "+sum);

		/*
		其实这就是累加思想。
		原理：通过变量记录住每次变化的结果。
		通过循环的形式。进行累加动作。

		*/
	}
}
