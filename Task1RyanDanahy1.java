/*
 * 
 */
 
public class Task1RyanDanahy1 
{
	
	public static void main(String[] args)
	{
		Doctor d = new Doctor("John", "Smith", "Neurology");
		Bill b = new Bill(9982, 2000.0, 1564.75, 1487.98);
		Patient p = new Patient(9982, "Steve", 32, 5261996, 7122016, 7153016);
		
		System.out.println(d);
		System.out.println(b);
		System.out.println(p);
	}
}
