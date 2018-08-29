class  Demo
{

	public static void sop(Object str)//Object str = new Integer(4);
	{
		System.out.println(str);
	}
	public static void main(String[] args) 
	{

		sop(4);
//		int[] arr = {3,1,5,8,23,9};
//
//		System.out.println(toString(arr));
//		System.out.println(toString_2(arr));
	}
	public static String toString_2(int[] arr)
	{
		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				sb.append(arr[x]+", ");
			else
				sb.append(arr[x]+"}");

		}
		return  sb.toString();
	}

	public static String toString(int[] arr)
	{
		String str = "[";

		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				str += arr[x]+", ";
			else
				str += arr[x]+"]";
		}
		return str;
	}
}
