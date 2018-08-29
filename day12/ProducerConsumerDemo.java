


class ProducerConsumerDemo 
{
	public static void main(String[] args) 
	{
		Resource r = new Resource();

		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);

		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(pro);
		Thread t3 = new Thread(con);
		Thread t4 = new Thread(con);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}

/*
对于多个生产者和消费者。
为什么要定义while判断标记。
原因：让被唤醒的线程再一次判断标记。


为什么定义notifyAll，
因为需要唤醒对方线程。
因为只用notify，容易出现只唤醒本方线程的情况。导致程序中的所有线程都等待。

*/


class Resource
{
	private String name;
	private int count = 1;
	private boolean flag = false;
			//  t1    t2
	public synchronized void set(String name)
	{
		while(flag)
			try{this.wait();}catch(Exception e){}//t1(放弃资格)  t2(获取资格)
		this.name = name+"--"+count++;

		System.out.println(Thread.currentThread().getName()+"...生产者.."+this.name);
		flag = true;
		this.notifyAll();
	}


	//  t3   t4  
	public synchronized void out()
	{
		while(!flag)
			try{wait();}catch(Exception e){}//t3(放弃资格) t4(放弃资格)
		System.out.println(Thread.currentThread().getName()+"...消费者........."+this.name);
		flag = false;
		this.notifyAll();
	}
}

class Producer implements Runnable
{
	private Resource res;

	Producer(Resource res)
	{
		this.res = res;
	}
	public void run()
	{
		while(true)
		{
			res.set("+商品+");
		}
	}
}

class Consumer implements Runnable
{
	private Resource res;

	Consumer(Resource res)
	{
		this.res = res;
	}
	public void run()
	{
		while(true)
		{
			res.out();
		}
	}
}
