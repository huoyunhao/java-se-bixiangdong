import java.io.*;

/*
File类常见方法：
1，创建。
	boolean createNewFile():在指定位置创建文件，如果该文件已经存在，则不创建，返回false。
						和输出流不一样，输出流对象一建立创建文件。而且文件已经存在，会覆盖。

	boolean mkdir():创建文件夹。
	boolean mkdirs():创建多级文件夹。
2，删除。
	boolean delete()：删除失败返回false。如果文件正在被使用，则删除不了返回falsel。
	void deleteOnExit();在程序退出时删除指定文件。


3，判断。
	boolean exists() :文件是否存在.
	isFile():
	isDirectory();
	isHidden();
	isAbsolute();

4，获取信息。
	getName():
	getPath():
	getParent():

	getAbsolutePath() 
	long lastModified() 
	long length() 


	


*/


class FileDemo 
{
	public static void main(String[] args) throws IOException
	{
		method_5();
	}

	public static void method_5()
	{
		File f1 = new File("c:\\Test.java");
		File f2 = new File("d:\\hahah.java");

		sop("rename:"+f2.renameTo(f1));

	}

	public static void method_4()
	{
		File f = new File("file.txt");

		sop("path:"+f.getPath());
		sop("abspath:"+f.getAbsolutePath());
		sop("parent:"+f.getParent());//该方法返回的是绝对路径中的父目录。如果获取的是相对路径，返回null。
									//如果相对路径中有上一层目录那么该目录就是返回结果。



	}
	
	public static void method_3()throws IOException
	{
		File f = new File("d:\\java1223\\day20\\file2.txt");

		//f.createNewFile();

		//f.mkdir();


		//记住在判断文件对象是否是文件或者目的时，必须要先判断该文件对象封装的内容是否存在。
		//通过exists判断。
		sop("dir:"+f.isDirectory());
		sop("file:"+f.isFile());

		sop(f.isAbsolute());
	}


	public static void method_2()
	{
		File f = new File("file.txt");

		//sop("exists:"+f.exists());

		//sop("execute:"+f.canExecute());

		//创建文件夹
		File dir = new File("abc\\kkk\\a\\a\\dd\\ee\\qq\\aaa");

		sop("mkdir:"+dir.mkdirs());
	}
	

	public static void method_1()throws IOException
	{
		File f = new File("file.txt");
//		sop("create:"+f.createNewFile());
		//sop("delete:"+f.delete());



		
	}







	//创建File对象
	public static void consMethod()
	{
		//将a.txt封装成file对象。可以将已有的和为出现的文件或者文件夹封装成对象。
		File f1 = new File("a.txt");

		//
		File f2 = new File("c:\\abc","b.txt");


		File d = new File("c:\\abc");
		File f3 = new File(d,"c.txt");

		sop("f1:"+f1);
		sop("f2:"+f2);
		sop("f3:"+f3);

		File f4 = new File("c:"+File.separator+"abc"+File.separator+"zzz"+File.separator+"a.txt");


	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
