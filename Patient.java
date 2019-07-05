/*
 * Patient.Java
 */
public class Patient extends Person
{
	//declarations
	String id;
	int age;
	Doctor dName = new Doctor();
	Date date = new Date();
	
	//Initialization Constructor
	Patient(String id, Doctor name, int age, Date date)
	{
		this.id = id;
		this.dName = name;
		this.age = age;
		this.date = date;
	}
	
	//default constructor
	public Patient()
	{
		this.id = "";
		this.age = 0;
	}
	
	//method definitions
	
	//returns id, name, age {
	
	public String getId()
	{
		return id;
	}	
	public String getDoctorName()
	{
		return dName.getDoctorName();
	}
	public String getDoctorSpl() {
		return dName.getDoctorSpl();
	}
	public int getAge()
	{
		return age;
	}	
	public String getDOB() {
		return date.getDOB();
	}
	public String getAdmDate() {
		return date.getAdmDate();
	}
	public String getDisDate() {
		return date.getDisDate();
	}
	
	
	//}
	
	//sets id, name, age {
	
	public void setID(String id) 
	{
		this.id = id;
	}
	public void setDoctorName(String fname, String lname) 
	{
		this.dName.setDoctorName(fname, lname);
	}
	public void setDoctorSpl(String str) {
		this.dName.setDoctorSpl(str);
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public void setDOB(int month, int day, int year) {
		this.date.setDOB(month, day, year);
	}
	public void setAdmDate(int month, int day, int year) {
		this.date.setAdmDate(month, day, year);
	}
	public void setDisDate(int month, int day, int year) {
		this.date.setDisDate(month, day, year);
	}
	
	//}
	
	//method prints the Patient details.
	public String toString()
	{
		String str = "";
		str += "Patient ID: " + id + "\nDoctor: " + this.dName.toString() +
				"\n" + date.toString();
		return str;
	}
}
