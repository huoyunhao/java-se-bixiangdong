/*====第十六题==================================
已知文件a.txt文件中的内容为“bcdeadferwplkou”，
请编写程序读取该文件内容，并按照自然顺序排序后输出到b.txt文件中。
即b.txt中的文件内容应为“abcd…………..”这样的顺序。
*/
import java.io.*;
import java.util.*;
class  Test16
{
	public static void main(String[] args) throws Exception
	{
		/*
		BufferedReader bufr = new BufferedReader(new FileReader("a.txt"));

		String line = bufr.readLine();

		char[] arr = line.toCharArray();

		Arrays.sort(arr);

		BufferedWriter bufw = new BufferedWriter(new FileWriter("b.txt"));

		bufw.write(arr);

		bufw.close();
		bufr.close();
		*/

		writeFile();
	}

	public static void writeFile()throws Exception
	{
		FileReader fr = new FileReader("a.txt");

		CharArrayWriter chw = new CharArrayWriter();

		int ch = 0;

		while((ch=fr.read())!=-1)
		{
			if(ch=='\r' || ch=='\n')
				continue;
			chw.write(ch);
		}

		char[] arr = chw.toCharArray();

		Arrays.sort(arr);

		FileWriter fw = new FileWriter("b.txt");

		fw.write(arr);

		fw.close();
		fw.close();


	}
}
