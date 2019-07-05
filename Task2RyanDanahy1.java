/*
 * Write a GUI program that converts seconds to years, weeks, days, hours, and minutes.
 * 
 * @author- Ryan Danahy
 * @assignment- CSCI 333 Project Task 2
 * @date- 5/4/18 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Task2RyanDanahy1 extends JFrame
{
	private JTextField jtfSeconds, jtfYears, jtfWeeks, jtfDays,
		jtfHours, jtfMinutes;
	
	private JLabel jlblEntertime, jlblYears, jlblWeeks, jlblDays,
		jlblHours, jlblMinutes;
	
	private JButton jbtnCalculate, jbtnExit;
	
	@SuppressWarnings("unused")
	private static final int WIDTH = 350;
	
	@SuppressWarnings("unused")
	private static final int HEIGHT = 400;
	
	//default constructor
	public Task2RyanDanahy1()
	{
		setTitle("Seconds Converter");
		Container c = getContentPane();
		c.setLayout(new GridLayout(7,1));
		
		/*
		 * 
		 */
		
		jlblEntertime = new JLabel("Enter Time in seconds", 
				SwingConstants.RIGHT);
		
		jlblYears = new JLabel("In years ", SwingConstants.RIGHT);
		
		jlblWeeks = new JLabel("In weeks ", SwingConstants.RIGHT);
		
		jlblDays = new JLabel("In days", SwingConstants.RIGHT);
		
		jlblHours = new JLabel("In hours", SwingConstants.RIGHT);
		
		jlblMinutes = new JLabel("In minutes", SwingConstants.RIGHT);
		
		/*
		 * 
		 */
		
		jtfMinutes = new JTextField(10);
		
		/*
		 * 
		 */
		
		jbtnCalculate = new JButton("CALCULATE");
		
		jbtnExit = new JButton("Exit");
		
		/*
		 * 
		 */
		
		c.add(jlblEntertime);		
		
		jtfSeconds = new JTextField(10);
		c.add(jtfSeconds);		
		c.add(jlblYears);		
		
		jtfYears = new JTextField(10);
		c.add(jtfYears);		
		c.add(jlblWeeks);	
		
		jtfWeeks = new JTextField(10);
		c.add(jtfWeeks);		
		c.add(jlblDays);		
		
		jtfDays = new JTextField(10);
		c.add(jtfDays);		
		c.add(jlblHours);		
		
		jtfHours = new JTextField(10);
		c.add(jtfHours);		
		c.add(jlblMinutes);		
		c.add(jtfMinutes);		
		c.add(jbtnCalculate);		
		c.add(jbtnExit);
		
		jbtnCalculate.addActionListener(new CalculateListener());
		jbtnExit.addActionListener(new ExitListener());
		
		setSize(511, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	} // default constructor end
	
	//Calculate Listener
	
	private class CalculateListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//local variables
			double inputTime, yr, d, wk, hr, min;
			
			inputTime = Double.parseDouble(jtfSeconds.getText());
			
			//conversions
			yr = inputTime/60/60/24/365;
			wk = inputTime/60/60/24/7;
			d = inputTime/60/60/24;
			hr = inputTime/60/60;	
			min = inputTime/60;
			
			//output
			jtfYears.setText(" " + yr);
			jtfWeeks.setText(" " + wk);
			jtfDays.setText(" " + d);
			jtfHours.setText(" " + hr);
			jtfMinutes.setText(" " + min);
		}
	}//CalculateListener
	
	private class ExitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			System.exit(0);
		}
	}//ExitListener
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Task2RyanDanahy1 task = new Task2RyanDanahy1();
	}
}
