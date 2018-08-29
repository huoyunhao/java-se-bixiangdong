

/*

1，线程间通信。
	等待/唤醒机制。

	也就是常见的生产者消费者问题。

	1.当多个生产者消费者出现时，
	需要让获取执行权的线程判断标记。
	通过while完成。

	2.需要将对方的线程唤醒。
	仅仅用notify，是不可以的。因为有可能出现只唤醒本方。
	有可能会导致，所有线程都等待。
	所以可以通过notifyAll的形式来完成 。



这个程序有一个bug。就是每次notifyAll。都会唤醒本方。
可不可以只唤醒对方呢？

JDK1.5版本提供了一些新的对象，优化了等待唤醒机制。

1，将synchronized 替换成了Lock接口。
	将隐式锁，升级成了显示锁。
	Lock
		获取锁：lock();
		释放锁：unlock();注意：释放的动作一定要执行，所以通常定义在finally中。
		获取Condition对象：newCondition();
2，将Object中的wait，notify，notifyAll方法都替换成了Condition的await，signal，signalAll。
	和以前不同是：一个同步代码块具备一个锁，该所以具备自己的独立wait和notify方法。
	现在是将wait，notify等方法，封装进一个特有的对象Condition，而一个Lock锁上可以有多个Condition对象。


	Lock lock = new ReentrantLock();

	Condition conA = lock.newCondition();
	Condition conB = lock.newCondition();

	con.await();//生产，，消费



	con.signal();生产


	set()
	{
		if(flag)
			conA.await();//生产者，
		code......;

		flag = true;
		conB.signal();
	}
	
	out()
	{
		if(!flag)
			conB.await();//消费者

		code....;
		flag = false;
		conA.signal();
	}



wait和sleep的区别：
wait:释放cpu执行权，释放同步中锁。
sleep:释放cpu执行权，不释放同步中锁。


synchronized(锁)
{
	wait();
}


停止线程：
	stop过时。
	原理：run方法结束。run方法中通常定义循环，指定控制住循环线程即可结束。

	1，定义结束标记。
	2，当线程处于了冻结状态，没有执行标记，程序一样无法结束。
		这时可以循环，正常退出冻结状态，或者强制结束冻结状态。
		强制结束冻结状态：interrupt();目的是线程强制从冻结状态恢复到运行状态。
		但是会发生InterruptedException异常。



线程中一些常见方法：
	setDaemon(boolean):将线程标记为后台线程，后台线程和前台线程一样，开启，一样抢执行权运行，
	只有在结束时，有区别，当前台线程都运行结束后，后台线程会自动结束。

	join():什么意思？等待该线程结束。当A线程执行到了B的.join方法时，A就会处于冻结状态。
			A什么时候运行呢？当B运行结束后，A就会具备运行资格，继续运行。

	加入线程，可以完成对某个线程的临时加入执行。

	


多线程重点：
1，多线程的创建的两种方式，以及区别。

2，
	同步的特点。
	同步的好处：
	同步的弊端：
	同步的前提：
	同步的表现形式以及区别。
	特例：static同步函数锁是哪一个。

	死锁代码要求写的出来。


3，线程间通信，看以上总结。


4，wait和sleep，  yield：临时暂停，可以让线程是释放执行权。






*/

