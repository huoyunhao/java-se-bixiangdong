class Fu
{
	void show()
	{
		System.out.println("fu show");
	}
}
class Zi extends Fu
{
	void function()
	{
		//super.show();
		this.show();
	}
	/*
	void show()
	{
		System.out.println("zi show");
	}
	*/
}


class  FuZi
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.function();
//		Fu f = new Zi();
//		f.function();


	}
}
