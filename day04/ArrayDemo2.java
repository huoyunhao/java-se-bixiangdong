class  ArrayDemo2
{
	public static void main(String[] args) 
	{
//		int[] arr = new int[2];
//		int arr[] = new int[2];

		//int[] arr = new int[]{3,1,6,5,4};

//		int[] arr = {3,1,6,5,4};
//		System.out.println(arr[2]);
//		int[] arr = new int[5];
//		arr[0] = 90;
//		arr[1] = 80;

		int[] arr = new int[3];
		
		arr = null;
		System.out.println(arr[1]);
		//ArrayIndexOutOfBoundsException: 3:操作数组时，访问到了数组中不存在的角标。

		//NullPointerException:空指针异常：当引用没有任何指向值为null的情况，该引用还在用于操作实体。

	}
}
