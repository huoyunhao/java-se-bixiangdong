import java.util.*;
/*
对给定数组进行排序。
{5,1,6,4,2,8,9}


*/
class ArrayTest2 
{

	/*
	选择排序。
	内循环结束一次，最值出现头角标位置上。
	*/
	public static void selectSort(int[] arr)
	{
		for (int x=0; x<arr.length-1 ; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					/*
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y]= temp;
					*/
					swap(arr,x,y);
				}
			}
		}
	}
	/*
	冒泡排序
	*/

	public static void bubbleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{									
			for(int y=0; y<arr.length-x-1; y++)//-x:让每一次比较的元素减少，-1：避免角标越界。
			{
				if(arr[y]<arr[y+1])
				{
					/*
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
					swap(arr,y,y+1);
				}
			}
		}
	}

	/*
	发现无论什么排序。都需要对满足条件的元素进行位置置换。
	所以可以把这部分相同的代码提取出来，单独封装成一个函数。
	*/
	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main(String[] args)
	{
		int[] arr = {5,1,6,4,2,8,9};
		//排序前；
		printArray(arr);

		//排序
		//selectSort(arr);
		//bubbleSort(arr);

		//Arrays.sort(arr);//java中已经定义好的一种排序方式。开发中，对数组排序。要使用该句代码。
		//排序后：
		printArray(arr);
			
	}

	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+", ");
			else
				System.out.println(arr[x]+"]");

		}		
	}
}
