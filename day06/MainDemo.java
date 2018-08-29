/*
public static void main(String[] args) 

主函数：是一个特殊的函数。作为程序的入口，可以被jvm调用。

主函数的定义：
public：代表着该函数访问权限是最大的。
static：代表主函数随着类的加载就已经存在了。
void：主函数没有具体的返回值。
main：不是关键字，但是是一个特殊的单词，可以被jvm识别。
（String[] arr）:函数的参数，参数类型是一个数组，该数组中的元素是字符串。字符串类型的数组。

主函数是固定格式的：jvm识别。

jvm在调用主函数时，传入的是new String[0];
*/

class MainDemo 
{
	public static void main(String[] args)//new String[]
	{
		String[] arr = {"hah","hhe","heihei","xixi","hiahia"};

		MainTest.main(arr);
	}
}

//String[] args = new String[3];
//String[] args = null;


class MainTest
{
	public static void main(String[] args)
	{
		for(int x=0; x<args.length; x++)
			System.out.println(args[x]);
	}
}