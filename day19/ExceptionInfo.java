
import java.io.*;
import java.util.*;
import java.text.*;
class  ExceptionInfo
{
	public static void main(String[] args)throws IOException 
	{
		try
		{
			int[] arr = new int[2];
			System.out.println(arr[3]);
		}
		catch (Exception e)
		{
			
			try
			{
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String s = sdf.format(d);

				PrintStream ps = new PrintStream("exeception.log");
				ps.println(s);
				System.setOut(ps);

				
			}
			catch (IOException ex)
			{
				throw new RuntimeException("日志文件创建失败");
			}
			e.printStackTrace(System.out);
		}
	}
}
//log4j
