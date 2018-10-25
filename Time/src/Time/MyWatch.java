package Time;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyWatch extends JFrame implements Runnable
{
	static JButton b1,b2;
	static JLabel l1;
	static Thread th1,th2;
	static String condition;
	public static void main(String []args)
	{
		MyWatch jf = new MyWatch();
		jf.setVisible(true);
		jf.setSize(new Dimension(300,200));
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setTitle("Watch");
		
	
		
		b1 = new JButton("Show Time");
		b2 = new JButton("Close Time");
		l1 = new JLabel("Time");
		
		jf.setLayout(null);
		jf.add(b1);
		jf.add(b2);
		jf.add(l1);
		
		b1.setBounds(10,5,100,40);
		b2.setBounds(175,5,100,40);
		l1.setBounds(130,80,100,20);
		
		b1.addActionListener(jf.new Time());
		b2.addActionListener(jf.new Time());
		
		
		
	}
	
	 class Time implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			th1 = new Thread(new MyWatch());
			th1.start();
			
			condition= e.getActionCommand();
			
			
		}
	}
	 
	 public void run()
	 {
		th2 = Thread.currentThread();
		while(th2 == th1)
		{
			getTime();
			try
			{
				th1.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
	 
	public void getTime()
	{

			Calendar cal = new GregorianCalendar();
			String hour = String.valueOf(cal.get(Calendar.HOUR));
			String minute = String.valueOf(cal.get(Calendar.MINUTE));
			String second = String.valueOf(cal.get(Calendar.SECOND));
			
			
			if(condition.equals("Show Time"))
			{
				l1.setText(hour+":"+minute+":"+second);
			}
			else
			{
				l1.setText("Time");
			}
	}
	
}