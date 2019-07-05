/*
 * 
 */

import java.util.Scanner;
 
public class Task1RyanDanahy 
{
	
	public static void main(String[] args)
	{
		//Scanner to get user input
		Scanner in = new Scanner(System.in);
		
		//asks for user input {
		
		//doctor info
		System.out.println("Doctor's First Name: ");
		String fname = in.nextLine();
		System.out.println("Doctor's Last Name: ");
		String lname = in.nextLine();
		System.out.println("Doctor's Specialization: ");
		String spe = in.nextLine();
		
		//attach user info to a doctor type variable
		Doctor d = new Doctor(fname, lname, spe);
		
		//Bill info
		System.out.println("Bill ID: ");
		int bID = in.nextInt();
		System.out.println("Medical Charges: $");
		double mcharg = in.nextDouble();
		System.out.println("Doctor Fee: $");
		double dfee = in.nextDouble();
		System.out.println("Room Charges: $");
		double rcharg = in.nextDouble();
		
		//attach user info to a Bill type variable
		Bill b = new Bill(bID, mcharg, dfee, rcharg);
		
		//Patient info
		System.out.println("Patient ID: ");
		int pID = in.nextInt();
		System.out.println("Patient's Name: ");
		String pname = in.nextLine();
		System.out.println("Patient's Age: ");
		int pAge = in.nextInt();
		System.out.println("Patient's Date of Birth: ");
		int DOB = in.nextInt();
		System.out.println("Patient's Date of Admit: ");
		int DOA = in.nextInt();
		System.out.println("Patient's Date of Disharge: ");
		int DOD = in.nextInt();
		
		//attach user info to a Patient type variable
		Patient p = new Patient(pID, pname, pAge, DOB, DOA, DOD);
		
		//}
		
		//close scanner
		in.close();
		
		//Print out info
		System.out.println("-- Doctor --");
		System.out.println(d);
		System.out.println("-- Bill --");
		System.out.println(b);
		System.out.println("-- Patient --");
		System.out.println(p);
	}
}
