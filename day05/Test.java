class Demo 
{
	public static void main(String[] args) 
	{
		int x = 4;
		show(x);
		System.out.println(x);
	}
	public static void show(int x)
	{
		x = 2;
	}
}

class Demo
{
	int x = 3;
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.x = 10;
		show(d);//show(new Demo());
		System.out.println(d.x);
	}
	public static void show(Demo d)
	{
		d.x = 6;
	}
}
class Demo
{
	public static void main(String[] args)
	{
		int[] arr = new int[2];
		show(arr);
		System.out.println(arr[0]);
	}
	public static void show(int[] arr)
	{
		arr[0]++;
	}
}