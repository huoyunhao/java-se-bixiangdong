/*
对给定的数组进行反转。
{3,1,5,6,2} --->
{2,6,5,1,3}
*/

class  ArrayTest3
{
	public static void main(String[] args) 
	{
		int[] arr = {3,1,5,6,2};
		printArray(arr);

		//反转后;
		reverseArray(arr);

		printArray(arr);

	}
	public static void reverseArray(int[] arr)
	{
		for(int start=0,end=arr.length-1; start<end ; start++,end--)
		{
			/*
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			*/
			swap(arr,start,end);
		}
	}
	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
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
