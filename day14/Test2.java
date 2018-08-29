
/*
"12 0 99 -7 30 4 100 13"
要求对字符串中的数值进行排序。生成一个数值从小到大新字符串。

"-7 0 4 12 13 30 99 100"

思路：
1，将字符串切割。变成字符串数组。
2，将字符串数组转成int数组。
3，int数组排序。
4，将int数组变成字符串。

*/
import java.util.*;
class Test2 
{
	public static void main(String[] args) 
	{
		String str = "12 0 99 -7 30 4 100 13";
		str = numberStringSort(str);

		System.out.println(str);
	}
	/**
	
	*/
	public static String numberStringSort(String str)
	{
		String[] arr = splitString(str);
		int[] nums = toIntArray(arr);
		Arrays.sort(nums);
		return intArraytoString(nums);
	}
	/*
	
	*/
	private static String[] splitString(String str)
	{
		return str.split(" ");
	}

	private static int[] toIntArray(String[] arr)
	{
		int[] nums = new int[arr.length];

		for(int x=0; x<arr.length; x++)
		{
			nums[x] = Integer.parseInt(arr[x]);
		}
		return nums;
	}

	private static String intArraytoString(int[] arr)
	{
		StringBuilder sb = new StringBuilder();

		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				sb.append(arr[x]+" ");
			else
				sb.append(arr[x]);
		}
		return sb.toString();
	}
}
