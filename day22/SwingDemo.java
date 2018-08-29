
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

class  SwingDemo
{
	public static void main(String[] args) 
	{
		JFrame f = new JFrame();

		f.setBounds(300,100,500,400);

		f.setLayout(new FlowLayout());

		JButton but = new JButton("我是一个按钮");

		f.add(but);

		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});


		f.setVisible(true);
	}
}
