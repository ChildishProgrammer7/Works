/*
 * Doctor.java
 */

public class Doctor extends Person 
{
	//declarations
	private String dName, spe;
	
	//constructor
	Doctor(String str, String str1, String str2)
	{
		super(str, str1);
		this.spe = str2;;
	}
	
	//default constructor
	public Doctor() {
		this.dName = "";
		this.spe = "";
	}
	
	//methods
	public String getDoctorName() {
		return dName;
	}
	
	public void setDoctorName(String fname, String lname) { 
		this.dName = "";
		this.dName += fname + " " + lname;
	}
	
	public String getDoctorSpl() {
		return spe;
	}
	
	public void setDoctorSpl(String str) {
		this.spe = " ";
		this.spe = str;
	}
	
	//string display
	public String toString()
	{
		String str = "";
		str += this.dName +" Specializes in " + spe;
		return str;
	}
}
