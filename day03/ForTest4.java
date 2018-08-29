/*
练习：3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。

*/
class  ForTest4
{
	public static void main(String[] args) 
	{
		int day = 0;
		for(int x=3000; x>=5; x/=2)
		{
			day++;
		}
		System.out.println("day="+day);

		/*
		for(int x=3000; x>=5; day++)
		{
			x = x/2;
		}
		*/
	}
}
