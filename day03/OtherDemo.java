class OtherDemo
{
	public static void main(String[] args)
	{
		//break��
		w:for(int x=0; x<3; x++)
		{
			for(int y=0; y<4; y++)
			{
				System.out.println("x="+x);
				break w;
			}
		}

		//continue:ֻ��������ѭ���ṹ������ѭ�����ص㣺��������ѭ����������һ��ѭ����

		for(int x=1; x<=10; x++)
		{
			if(x%2==1)
				continue;
			System.out.println("x="+x);

		}

		w:for(int x=0; x<3; x++)
		{
			for(int y=0; y<4; y++)
			{
				System.out.println("x="+x);
				continue w;
			}
		}

		/*
		��ס��
		1��break��continue������õķ�Χ��
		2��break��continue��������ʱ������������κ���䡣��Ϊ��ִ�в�����
		*/

//		break;
//		continue;
	}
}
