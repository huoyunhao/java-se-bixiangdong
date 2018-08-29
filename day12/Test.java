class MyThread extends Thread{
	public void run(){
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("MyThread running");
	}
}



public class ThreadTest{
	public static void main(String argv[]) {
		MyThread t = new MyThread();
		t.run();
		t.start();
		System.out.println("Thread Test");
	  }
}

/*
代码分析过程：

MyThread t = new MyThread();
创建了一个线程。

t.run();
调用MyThread对象的run方法。
这是只有一个线程在运行就是主线程。
当主线程执行到了run方法中的sleep(3000);时。
这是主线程处于冻结状态。程序并没有任何执行。
当3秒过后，主线程打印了  MyThread running。 run方法执行结束。

t.start();
开启了t线程。
有两种可能情况。
第一种，主线程在只执行了t.start()后，还具有执行权，继续往下执行，
打印了Thread Test。主线程结束。
t线程获取执行权，调用自己的run方法。然后执行的sleep(3000);冻结3秒。
3秒后，打印MyThread running t线程结束，整个程序结束。

第二种情况：
主线程执行到t.start();开启了t线程，t线程就直接获取到了执行权。
就调用自己的run方法。
指定到sleep(3000).t线程冻结3秒，这是t线程就是释放了执行权。
那么主线程开始执行打印了Thread Test，主线程结束。
等到3秒后，t线程打印MyThread running ，然后t线程结束。
程序结束。







*/

