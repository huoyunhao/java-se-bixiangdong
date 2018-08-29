/*====第十八题==================================
在java中，字符串“abcd”与字符串“ab你好”的长度是一样，都是四个字符。
但对应的字节数不同，一个汉字占两个字节。
定义一个方法，按照最大的字节数来取子串。
如：对于“ab你好”，如果取三个字节，那么子串就是ab与“你”字的半个，
那么半个就要舍弃。如果去四个字节就是“ab你”，取五个字节还是“ab你”.


思路：
汉字的默认编码gbk。
所以一个汉字两个字节。都是负数。
只有判断最后一个字节是否是负数。
如果是，就往前继续看有多少负数。如果是偶数个，不舍弃。
如果是奇数个，即舍弃最后一个字节。


步骤：
1，将字符串变成字节数组。
2，定义计数器，记录负数的个数。
3，在通过计数器的奇偶来判断是否舍弃。

*/

class  Test18
{
	public static void main(String[] args) 
	{
		String s = cutString("abc你好kk谢谢",7);
		System.out.println(s);
	}	
	public static String cutString(String str,int len)
	{
		byte[] arr = str.getBytes();
		int count = 0;
		for(int x = len-1; x>=0; x--)
		{
			if(arr[x]<0)
			{
				count++;
			}
			else
				break;
		}

		if(count%2==0)
			return new String(arr,0,len);
		else
			return new String(arr,0,len-1);
	}
}
