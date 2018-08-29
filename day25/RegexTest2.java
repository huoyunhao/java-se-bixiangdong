/*
网页爬虫(蜘蛛)
*/
import java.io.*;
import java.util.regex.*;
import java.net.*;
import java.util.*;
class RegexTest2 
{
	public static void main(String[] args) throws Exception
	{
		getMails_1();
	}


	public static void getMails_1()throws Exception
	{
		URL url = new URL("http://192.168.1.254:8080/myweb/mail.html");

		URLConnection conn = url.openConnection();

		BufferedReader bufIn = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String line = null;

		String mailreg = "\\w+@\\w+(\\.\\w+)+";
		Pattern p = Pattern.compile(mailreg);

		

		while((line=bufIn.readLine())!=null)
		{
			Matcher m = p.matcher(line);
			while(m.find())
			{
				System.out.println(m.group());
			}
		}
	}

	/*
	获取指定文档中的邮件地址。
	使用获取功能。Pattern  Matcher
	*/
	public static void getMails()throws Exception
	{
		BufferedReader bufr = 
			new BufferedReader(new FileReader("mail.txt"));

		String line = null;

		String mailreg = "\\w+@\\w+(\\.\\w+)+";
		Pattern p = Pattern.compile(mailreg);



		while((line=bufr.readLine())!=null)
		{
			Matcher m = p.matcher(line);
			while(m.find())
			{
				System.out.println(m.group());
			}
		}
	}
}
