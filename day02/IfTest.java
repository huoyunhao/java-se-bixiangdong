class IfTest 
{
	public static void main(String[] args) 
	{
		//需求1：根据用户定义的数值不同。打印对应的星期英文。
		/*
		int num = 1;

		if(num==1)
			System.out.println("monday");
		else if(num==2)
			System.out.println("tsd");
		else
			System.out.println("nono");
		*/
		//需求2：根据用于指定月份，打印该月份所属的季节。
		//3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季

		int x = 4;

		if(x==3 || x==4 || x==5)
			System.out.println(x+"春季");
		else if(x==6 || x==7 || x==8)
			System.out.println(x+"夏季");
		else if(x==9 || x==10 || x==11)
			System.out.println(x+"秋季");
		else if(x==12 || x==1 || x==2)
			System.out.println(x+"冬季");
		else
			System.out.println(x+"月份不存在");


		if(x>12 || x<1)
			System.out.println(x+"月份不存在");
		else if(x>=3 && x<=5)
			System.out.println(x+"春季");
		else if(x>=6 && x<=8)
			System.out.println(x+"夏季");
		else if(x>=9 && x<=11)
			System.out.println(x+"秋季");
		else
			System.out.println(x+"冬季");








	}
}
