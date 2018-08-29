import java.net.*;

class  IPDemo
{
	public static void main(String[] args) throws Exception
	{
		//InetAddress i = InetAddress.getLocalHost();

//		System.out.println(i.toString());
//		System.out.println("address:"+i.getHostAddress());
//		System.out.println("name:"+i.getHostName());

		InetAddress ia = InetAddress.getByName("thinkpad-sl400");
		System.out.println("address:"+ia.getHostAddress());
		System.out.println("name:"+ia.getHostName());



	}
}
