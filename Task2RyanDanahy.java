import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Task2RyanDanahy 
{
	
	public static void main(String[] args)
	{
		//declarations
		String secStr, output;
		double sec, min, hr, d, yr;
		
		//DF object creation
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		//Get seconds as string
		secStr = JOptionPane.showInputDialog("Enter some number of seconds.");
		
		//Turn String into double
		sec = Double.parseDouble(secStr);
		
		//Get the minutes, hours, and days out of the seconds
		min = (sec/60);
		hr = (min/60);
		d = (hr/24);
		yr = (d/365);
		
		//Check amount of seconds against a set of conditions
		if(sec >= 60 && sec < 3600)
		{
			output = "There are " + df.format(min) + " minutes in "
					+ df.format(sec) + " seconds.";
			JOptionPane.showMessageDialog(null, output, "Time", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if(sec >= 3600 && sec < 86400)
		{
			output = df.format(sec) + " seconds can be written as either: \n"
					+ df.format(d) + " days, \n" +
					df.format(hr) + " hours, or \n" +
					df.format(min) + " minutes. \n";
			JOptionPane.showMessageDialog(null, output, "Time", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (sec >= 3153600)
		{
			output = df.format(sec) + " seconds can be written as either: \n" +
					df.format(yr) + " years, \n" +
					df.format(d) + " days, \n" +
					df.format(hr) + " hours, or \n" +
					df.format(min) + "minutes. \n";
			JOptionPane.showMessageDialog(null, output, "Time", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else
		{
			output = "There are" + df.format(sec) + " seconds. \n Not enough for a minute, hour, or day.";
			JOptionPane.showMessageDialog(null, output, "Time", JOptionPane.INFORMATION_MESSAGE);
		}
		
		System.exit(0);
	}
}
