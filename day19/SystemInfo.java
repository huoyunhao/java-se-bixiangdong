import java.util.*;
import java.io.*;
class  SystemInfo
{
	public static void main(String[] args) throws IOException
	{
		Properties prop = System.getProperties();

		//System.out.println(prop);
		prop.list(new PrintStream("sysinfo.txt"));
	}
}
