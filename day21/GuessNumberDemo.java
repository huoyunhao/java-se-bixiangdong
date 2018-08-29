/*
猜数字游戏：
1，产生随机数。
2，获取键盘录入。
3，将录入数据变成数字，和随机数比较。
	给出提示信息。
4，重复这个过程，如果猜中，程序就结束。
注意：对于输入1~100以外的数字，，以及非数字要给出提示。

*/
import java.io.*;
import java.util.*;
class GuessNumber
{
	private int ranNum;
	GuessNumber()
	{
		Random r = new Random();
		ranNum = r.nextInt(100)+1;//(int)Math.random()*100+1;
	}

	public void play()
	{
		System.out.println("游戏开始：输入1~100之间的数字:");
		boolean b = false;
		while(!b)
		{
			try
			{
				int num = getNum();
				if(num>=1 && num<=100)
					b = isLuck(num);
				else
					System.out.println("数值超出范围");
			}
			catch (IOException e)
			{
				throw new RuntimeException("录入数据失败");
			}
			catch(NumberFormatException e)
			{
				System.out.println("输入了非法数据");
			}
			
		}
	}

	//获取键盘的数字
	private int getNum()throws IOException,NumberFormatException
	{
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(bufr.readLine());
		return num;

	}

	//和随机数比较
	private boolean isLuck(int num)
	{
		boolean b = false;
		if(num>ranNum)
			System.out.println("大了，继续");
		else if(num<ranNum)
			System.out.println("小了，继续");
		else
		{
			System.out.println("中了，恭喜");
			b = true;
		}
		return b;

	}
}

class  GuessNumberDemo
{
	public static void main(String[] args) 
	{
		new GuessNumber().play();
	}
}
