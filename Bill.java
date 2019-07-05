/*
 * Bill.java
 */

public class Bill 
{
	//declarations
	private
		String id;
		double medicCharges, docFee, romCharge;
		
	//default constructor
	public Bill()
	{
		this.id = "";
		this.medicCharges = 0.0;
		this.docFee = 0.0;
		this.romCharge = 0.0;
	}
	
	//constructor - initializes user data regarding the bill details
	public Bill(String id, double pharmacyCharges, double doctorsFee, double roomCharges)
	{
		this.id = id;
		this.medicCharges = pharmacyCharges;
		this.docFee = doctorsFee;
		this.romCharge = roomCharges;
	}
	
	//method definitions
	
	//returns id
	public String getId()
	{
		return id;
	}
	
	//sets id
	public void setID(String id)
	{
		this.id = id;
	}
	
	//returns medical charges
	public double getPharmacyCharges()
	{
		return medicCharges;
	}
	
	//sets medical charges
	public void setPharmacyCharges(double charges)
	{
		this.medicCharges = charges;
	}
	
	//returns doctor fee
	public double getDoctorFee()
	{
		return docFee;
	}
	
	//sets doctor fee
	public void setDoctorFee(double fee)
	{
		this.docFee = fee;
	}
	
	//returns room charges
	public double getRoomRent()
	{
		return romCharge;
	}
	
	// sets room charges 
	public void setRoomRent(double charges)
	{
		this.romCharge = charges;
	}
	
	//prints the bill information
	public String toString()
	{
		String str="";
		str += "\nBill ID: " + id + "\nMedic Charges: " + medicCharges
				+ "\nDoctor Fee: " + docFee + "\nRoom Charges: "
				+romCharge;
		return str;
	}
}
