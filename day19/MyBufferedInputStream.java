import java.io.*;

class MyBufferedInputStream
{
	private InputStream in;

	private byte[] buf = new byte[1024*4];
		
	private int pos = 0,count = 0;
	
	MyBufferedInputStream(InputStream in)
	{
		this.in = in;
	}

	//一次读一个字节，从缓冲区(字节数组)获取。
	public int myRead()throws IOException
	{
		//通过in对象读取硬盘上数据，并存储buf中。
		if(count==0)
		{
			count = in.read(buf);
			if(count<0)
				return -1;
			pos = 0;
			byte b = buf[pos];

			count--;
			pos++;
			return b&255;
		}
		else if(count>0)
		{
			byte b = buf[pos];

			count--;
			pos++;
			return b&0xff;
		}
		return -1;

	}
	public void myClose()throws IOException
	{
		in.close();
	}
}


/*
11111111-111111110000000000101001001010100101010010101001010


byte: -1  --->  int : -1;
00000000 00000000 00000000 11111111  255

11111111 11111111 11111111 11111111


11111111  -->提升了一个int类型 那不还是-1吗？是-1的原因是因为在8个1前面补的是1导致的。
那么我只要在前面补0，即可以保留原字节数据不变，又可以避免-1的出现。
怎么补0呢？

 11111111 11111111 11111111 11111111                        
&00000000 00000000 00000000 11111111 
------------------------------------
 00000000 00000000 00000000 11111111 

0000-0001
1111-1110
000000001
1111-1111  -1


结论：
字节流的读一个字节的read方法为什么返回值类型不是byte，而是int。
因为有可能会读到连续8个二进制1的情况，8个二进制1对应的十进制是-1.
那么就会数据还没有读完，就结束的情况。因为我们判断读取结束是通过结尾标记-1来确定的。
所以，为了避免这种情况将读到的字节进行int类型的提升。
并在保留原字节数据的情况前面了补了24个0，变成了int类型的数值。


而在写入数据时，只写该int类型数据的最低8位。


*/