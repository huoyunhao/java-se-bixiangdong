

class Test implements Runnable
{
	private boolean flag;
	Test(boolean flag)
	{
		this.flag = flag;
	}

	public void run()
	{
		if(flag)
		{
			while(true)
			{
				synchronized(MyLock.locka)
				{
					System.out.println(Thread.currentThread().getName()+"...if locka ");
					synchronized(MyLock.lockb)
					{
						System.out.println(Thread.currentThread().getName()+"..if lockb");					
					}
				}
			}
		}
		else
		{
			while(true)
			{
				synchronized(MyLock.lockb)
				{
					System.out.println(Thread.currentThread().getName()+"..else lockb");
					synchronized(MyLock.locka)
					{
						System.out.println(Thread.currentThread().getName()+".....else locka");
					}
				}
			}
		}
	}
}


class MyLock
{
	static Object locka = new Object();
	static Object lockb = new Object();
}

class  DeadLockTest
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Test(true));
		Thread t2 = new Thread(new Test(false));
		t1.start();
		t2.start();
	}
}
