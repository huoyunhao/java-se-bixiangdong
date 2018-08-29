
import java.awt.*;
import java.awt.event.*;


class  FrameDemo
{

	//定义该图形中所需的组件的引用。
	private Frame f;
	private Button but;

	FrameDemo()
	{
		init();
	}

	public void init()
	{
		f = new Frame("my frame");

		//对frame进行基本设置。
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());

		but = new Button("my button");

		//将组件添加到frame中
		f.add(but);


		//加载一下窗体上事件。
		myEvent();

		//显示窗体;
		f.setVisible(true);

	}
	private void myEvent()
	{
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		//让按钮具备退出程序的功能
		/*
		按钮就是事件源。
		那么选择哪个监听器呢？
		通过关闭窗体示例了解到，想要知道哪个组件具备什么样的特有监听器。
		需要查看该组件对象的功能。
		 通过查阅button的描述。发现按钮支持一个特有监听addActionListener。

		*/
		but.addActionListener(new ActionListener()
		{
			private int count = 1;
			public void actionPerformed(ActionEvent e)
			{
				//System.out.println("退出，按钮干的");
				//System.exit(0);
				
				//f.add(new Button("Button-"+(count++)));
				//f.setVisible(true);
				//f.validate();

				//System.out.println(e.getSource());
				Button b = (Button)e.getSource();
				
				Frame f1 = (Frame)b.getParent();

				f1.add(new Button("button-"+count++));
				f1.validate();


			}
		});
	}



	public static void main(String[] args) 
	{
		new FrameDemo();
	}
}
