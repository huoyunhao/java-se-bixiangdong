/*
给定一个数组{5,1,6,4,2,8,9}。

1，获取数组中的最大值，以及最小值。


*/

class ArrayTest 
{

	/*
	获取数组中的最大值。
	思路：
	1，获取最值需要进行比较。每一次比较都会有一个较大的值。因为该值不确定。
	通过一个变量进行临储。
	2，让数组中的每一个元素都和这个变量中的值进行比较。
	如果大于了变量中的值，就用该该变量记录较大值。
	3，当所有的元素都比较完成，那么该变量中存储的就是数组中的最大值了。

	步骤：
	1，定义变量。初始化为数组中任意一个元素即可。
	2，通过循环语句对数组进行遍历。
	3，在变量过程中定义判断条件，如果遍历到的元素比变量中的元素大，就赋值给该变量；
	
	需要定义一个功能来完成。以便提高复用性。
	1，明确结果，数组中的最大元素 int。、
	2，未知内容：一个数组。int[]
	*/
	public static int getMax(int[] arr)
	{
		int max = arr[0];

		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>max)
				max = arr[x];
		}
		return max;
	}


	/*
	获取最大值的另一种方式。
	可不可以将临时变量初始化为0呢？可以。这种方式，其实是在初始化为数组中任意一个角标。


	*/
	public static int getMax_2(int[] arr)
	{
		int max = 0;

		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}


	/*
	获取最小值。
	*/
	public static int getMin(int[] arr)
	{
		int min = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]<arr[min])
				min = x;
		}
		return arr[min];
	}

	//获取double类型数组的最大值。因为功能一致，所以定义相同函数名称。以重载形式存在。
	/*
	public static double getMax(double[] arr)
	{
		
	}
	*/
	public static void main(String[] args)
	{
		int[] arr ={5,1,6,4,2,8,9};

		int max = getMax_2(arr);
		int min = getMin(arr);
		System.out.println("max="+max);
		System.out.println("min="+min);


//		boolean[] ar = new boolean[3];
//		System.out.println(ar[1]);
	}

}
