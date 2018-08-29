class  SwitchTest
{
	public static void main(String[] args) 
	{

		//需求2：根据用于指定月份，打印该月份所属的季节。
		//3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季

		int x = 4;

		switch(x)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(x+"春季");
				break;
			
			case 6:
			case 7:
			case 8:
				System.out.println(x+"夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(x+"秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(x+"冬季");
				break;
			default:
				System.out.println("nono");

		}

		/*
		if和switch语句很像。
		具体什么场景下，应用哪个语句呢？
		如果判断的具体数值不多，而是符合byte short int char这四种类型。
		虽然两个语句都可以使用，建议使用swtich语句。因为效率稍高。

		其他情况：对区间判断，对结果为boolean类型判断，使用if，if的使用范围更广。

		*/
		System.out.println("Hello World!");
	}
}
