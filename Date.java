/*
 * Date.java
 */

public class Date extends Person{
	//declarations
	private String DOB, DOA, DOD;
	
	//methods
	public String getDOB() {
		return DOB;
	}
	
	public void setDOB(int month, int day, int year) {
		this.DOB = "";
		this.DOB += month + "-" + day + "-" + year;
	}
	
	public String getAdmDate() {
		return DOA;
	}
	
	public void setAdmDate(int month, int day, int year) {
		this.DOA = "";
		this.DOA += month + "-" + day + "-" + year;
	}
	
	public String getDisDate() {
		return DOD;
	}
	
	public void setDisDate(int month, int day, int year) {
		this.DOD = "";
		this.DOD += month + "-" + day + "-" + year;
	}
	
	//toString method
	public String toString() {
		String str = "";
		str += "Admit Date: " + DOA +
				"\nDischarge Date: " + DOD;
		return str;
	}
}
