
/*
对字符串排序。
"zxcvbasdfg"
思路：
1，字符串变数组。
2，数组排序。
3，数组变字符串。

*/
import java.util.*;
class  Test
{
	public static void main(String[] args) 
	{
		String str = "zxcvbasdfg";

//		char[] arr = str.toCharArray();
//		Arrays.sort(arr);
//		System.out.println(new String(arr));
//		str = sortString(str);
//		System.out.println(str);
	}

	public static String sortString(String str)
	{
		char[] arr = stringToArray(str);

		sort(arr);

		return arrayToString(arr);
	}

	private static char[] stringToArray(String str)
	{
		return str.toCharArray();
	}

	private static void sort(char[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
		}
	}
	private static void swap(char[] arr,int x,int y)
	{
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	private static String arrayToString(char[] arr)
	{
		return new String(arr);
	}
}
