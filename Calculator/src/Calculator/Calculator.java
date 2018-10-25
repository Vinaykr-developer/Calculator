package Calculator;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Calculator {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			
			public void run()
			{
				new Cal();
			}
		});

	}

}

class Cal 
{

	JFrame jf ;
	JPanel pan ;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	JTextField tf;
	
	double firstnum;
	double secondnum;
	String operation;
	double result;
	
	
	public Cal()
	{
		 jf = new JFrame("Calculator");
		 jf.setVisible(true);
		 jf.setLocation(500,100);
		 jf.setSize(new Dimension(350,450));
		 jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		 jf.getContentPane().setBackground(Color.black);
		 jf.setLayout(null);
		 jf.setResizable(false);
		 ImageIcon icon = new ImageIcon("cal-icon.png");
		 jf.setIconImage(icon.getImage());
		 
		 tf = new JTextField();
		 tf.setBounds(0, 0, 345,60);
		 tf.setBackground(Color.BLACK);
		 tf.setBorder(BorderFactory.createLineBorder(Color.black));
		 tf.setHorizontalAlignment(SwingConstants.RIGHT);
		 tf.setFont(new Font("Arial",Font.BOLD,20));
		 tf.setForeground(Color.white);
		 
		 b1 = new JButton("C");
		 b1.setFont(new Font("Arial",Font.BOLD,20));
		 b1.setForeground(Color.white);
		 b1.setBackground(Color.blue);
		 b1.setBorder(BorderFactory.createLineBorder(Color.blue));
		 b1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					tf.setText(null);
				}
				 
			 });
		 
		 b2 = new JButton("B");
		 b2.setFont(new Font("Arial",Font.BOLD,20));
		 b2.setForeground(Color.white);
		 b2.setBackground(Color.blue);
		 b2.setBorder(BorderFactory.createLineBorder(Color.blue));
		 b2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText();
					StringBuilder back = new StringBuilder(number);
					back.deleteCharAt(number.length()-1);
					tf.setText(back.toString());
				}
				 
			 });
		 
		 b3 = new JButton("%");
		 b3.setFont(new Font("Arial",Font.BOLD,20));
		 b3.setForeground(Color.white);
		 b3.setBackground(Color.blue);
		 b3.setBorder(BorderFactory.createLineBorder(Color.blue));
		 b3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					firstnum = Double.parseDouble(tf.getText());
					tf.setText("");
					operation = "%";
				}
				 
			 });
		 
		 b4 = new JButton("/");
		 b4.setFont(new Font("Arial",Font.BOLD,20));
		 b4.setForeground(Color.white);
		 b4.setBackground(Color.blue);
		 b4.setBorder(BorderFactory.createLineBorder(Color.blue));
		 b4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					firstnum = Double.parseDouble(tf.getText());
					tf.setText("");
					operation = "/";
				}
				 
			 });
		 
		 b5 = new JButton("7");
		 b5.setFont(new Font("Arial",Font.BOLD,20));
		 b5.setBackground(Color.white);
		 b5.setBorder(BorderFactory.createLineBorder(Color.white));
		 b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String number = tf.getText() + b5.getActionCommand();
				tf.setText(number);
			}
			 
		 });
		 
		 b6 = new JButton("8");
		 b6.setFont(new Font("Arial",Font.BOLD,20));
		 b6.setBackground(Color.white);
		 b6.setBorder(BorderFactory.createLineBorder(Color.white));
		 b6.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText() + b6.getActionCommand();
					tf.setText(number);
				}
				 
			 });
		 
		 b7 = new JButton("9");
		 b7.setFont(new Font("Arial",Font.BOLD,20));
		 b7.setBackground(Color.white);
		 b7.setBorder(BorderFactory.createLineBorder(Color.white));
		 b7.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText() + b7.getActionCommand();
					tf.setText(number);
				}
				 
			 });
		
		 
		 b8 = new JButton("x");
		 b8.setFont(new Font("Arial",Font.BOLD,20));
		 b8.setForeground(Color.white);
		 b8.setBackground(Color.blue);
		 b8.setBorder(BorderFactory.createLineBorder(Color.blue));
		 b8.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					firstnum = Double.parseDouble(tf.getText());
					tf.setText("");
					operation = "x";
				}
				 
			 });
		
		 
		 b9 = new JButton("4");
		 b9.setFont(new Font("Arial",Font.BOLD,20));
		 b9.setBackground(Color.white);
		 b9.setBorder(BorderFactory.createLineBorder(Color.white));
		 b9.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText() + b9.getActionCommand();
					tf.setText(number);
				}
				 
			 });
		 
		 b10 = new JButton("5");
		 b10.setFont(new Font("Arial",Font.BOLD,20));
		 b10.setBackground(Color.white);
		 b10.setBorder(BorderFactory.createLineBorder(Color.white));
		 b10.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText() + b10.getActionCommand();
					tf.setText(number);
				}
				 
			 });
		 
		 b11 = new JButton("6");
		 b11.setFont(new Font("Arial",Font.BOLD,20));
		 b11.setBackground(Color.white);
		 b11.setBorder(BorderFactory.createLineBorder(Color.white));
		 b11.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText() + b11.getActionCommand();
					tf.setText(number);
				}
				 
			 });
		 
		 b12 = new JButton("-");
		 b12.setFont(new Font("Arial",Font.BOLD,20));
		 b12.setForeground(Color.white);
		 b12.setBackground(Color.blue);
		 b12.setBorder(BorderFactory.createLineBorder(Color.blue));
		 b12.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					firstnum = Double.parseDouble(tf.getText());
					tf.setText("");
					operation = "-";
				}
				 
			 });
		 
		 b13 = new JButton("1");
		 b13.setFont(new Font("Arial",Font.BOLD,20));
		 b13.setBackground(Color.white);
		 b13.setBorder(BorderFactory.createLineBorder(Color.white));
		 b13.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText() + b13.getActionCommand();
					tf.setText(number);
				}
				 
			 });
		 
		 b14 = new JButton("2");
		 b14.setFont(new Font("Arial",Font.BOLD,20));
		 b14.setBackground(Color.white);
		 b14.setBorder(BorderFactory.createLineBorder(Color.white));
		 b14.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText() + b14.getActionCommand();
					tf.setText(number);
				}
				 
			 });
		 
		 b15 = new JButton("3");
		 b15.setFont(new Font("Arial",Font.BOLD,20));
		 b15.setBackground(Color.white);
		 b15.setBorder(BorderFactory.createLineBorder(Color.white));
		 b15.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText() + b15.getActionCommand();
					tf.setText(number);
				}
				 
			 });
		 
		 b16 = new JButton("+");
		 b16.setFont(new Font("Arial",Font.BOLD,20));
		 b16.setForeground(Color.white);
		 b16.setBackground(Color.blue);
		 b16.setBorder(BorderFactory.createLineBorder(Color.blue));
		 b16.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					firstnum = Double.parseDouble(tf.getText());
					tf.setText("");
					operation = "+";
				}
				 
			 });
		 
		 b17 = new JButton(".");
		 b17.setFont(new Font("Arial",Font.BOLD,20));
		 b17.setBackground(Color.white);
		 b17.setBorder(BorderFactory.createLineBorder(Color.white));
		 b17.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText() + b17.getActionCommand();
					tf.setText(number);
				}
				 
			 });
		 
		 b18 = new JButton("0");
		 b18.setFont(new Font("Arial",Font.BOLD,20));
		 b18.setBackground(Color.white);
		 b18.setBorder(BorderFactory.createLineBorder(Color.white));
		 b18.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String number = tf.getText() + b18.getActionCommand();
					tf.setText(number);
				}
				 
			 });
		 
		 b19 = new JButton("=");
		 b19.setFont(new Font("Arial",Font.BOLD,20));
		 b19.setForeground(Color.white);
		 b19.setBackground(Color.blue);
		 b19.setBorder(BorderFactory.createLineBorder(Color.blue));
		 b19.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					String ans = null;
					secondnum = Double.parseDouble(tf.getText());
	
					if(operation == "+")
					{
						result = firstnum + secondnum;
						ans = String.format("%.2f", result);
						tf.setText(ans);
						
					}
					
					if(operation == "-")
					{
						result = firstnum - secondnum;
						ans = String.format("%.2f", result);
						tf.setText(ans);
						
					}
					
					if(operation == "x")
					{
						result = firstnum * secondnum;
						ans = String.format("%.2f", result);
						tf.setText(ans);
						
					}
					
					if(operation == "/")
					{
						result = firstnum / secondnum;
						ans = String.format("%.2f", result);
						tf.setText(ans);
						
					}
					
					if(operation == "%")
					{
						result = firstnum / 100 * secondnum;
						ans = String.format("%.2f", result);
						tf.setText(ans);
						
					}
				}
				 
			 });
		 
		 b20 = new JButton("CL");
		 b20.setFont(new Font("Arial",Font.BOLD,20));
		 b20.setBackground(Color.white);
		 b20.setBorder(BorderFactory.createLineBorder(Color.white));
		 
		
		 
		 pan = new JPanel();
		 pan.setBackground(Color.black);
		 pan.setBounds(0,60,350,360);
		 pan.setLayout(new GridLayout(5,4,0,0));
		 
		
		 pan.add(b1);
		 pan.add(b2);
		 pan.add(b3);
		 pan.add(b4);
		 pan.add(b5);
		 pan.add(b6);
		 pan.add(b7);
		 pan.add(b8);
		 pan.add(b9);
		 pan.add(b10);
		 pan.add(b11);
		 pan.add(b12);
		 pan.add(b13);
		 pan.add(b14);
		 pan.add(b15);
		 pan.add(b16);
		 pan.add(b17);
		 pan.add(b18);
		 pan.add(b20);
		 pan.add(b19);
		 
		 jf.add(tf);
		 jf.add(pan);
		// jf.setIconImage(Toolkit.getDefaultToolkit().getImage(jf.getClass().getResource("file:///C:/Users/Dell/eclipse-workspace/MyWatch/src/Watch/cal-icon.png")));
		 
		 
		 
	}

}
