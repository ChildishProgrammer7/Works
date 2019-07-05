import java.util.Scanner;

class Gradebook {
	
	//fields
	
	private String studentName;
	private double[] score = new double[3];
	private String[] grade = new String[3];
	private String GPA;
	
	//constructors
	
	public Gradebook() {
		studentName = "";
		score[0] = 0;
		score[1] = 0;
		score[2] = 0;
		grade[0] = "";
		grade[1] = "";
		grade[2] = "";
		GPA = "";
	}
	
	public Gradebook(String name, double scoreA, double scoreB, double scoreC) {
		studentName = name;
		score[0] = scoreA;
		score[1] = scoreB;
		score[2] = scoreC;
		grade[0] = "";
		grade[1] = "";
		grade[2] = "";
		GPA = "";
	}
	
	//methods
	
	public void setName (String newName) {
		studentName = newName;
	}
	
	public void setScore (int n, double newScore) {
		switch (n) {
			
			case 1:	score[0] = newScore;
					break;
					
			case 2:	score[1] = newScore;
					break;
					
			case 3:	score[2] = newScore;
					break;
					
			default:	System.out.println("Invalid Input");
						break;
						
		}
	}
	
	public String getName() {
		return studentName;
	}
	
	public double getScore(int n) {
		switch(n) {
		case 1: return score[0];
		case 2: return score[1];
		case 3: return score[2];
		default: System.out.println("Wrong Input");
			return 0;
		}
	}
	
	public String getGrade(int n) {
		switch(n) {
		case 1: return grade[0];
		case 2: return grade[1];
		case 3: return grade[2];
		default: System.out.println("Wrong Input");
			return "";
		}
	}
	public void calcGrades () {
		for(int i = 0; i < 3; i++) {
			if( score[i] <= 100 && score[i] >= 90 )
				grade[i] = "A";
			else if( score[i] < 90 && score[i] >= 80)
				grade[i] = "B";
			else if( score[i] < 80 && score[i] >= 50)
				grade[i] = "C";
			else if( score[i] < 50 && score[i] >= 20)
				grade[i] = "D";
			else if( score[i] < 20 && score[i] >= 0)
				grade[i] = "E";
			else
				System.out.println(" Incorrect Value ");
		}
	}
	
	public double total () {
		double sum = 0;
		
		for(int i = 0; i < 3; i++) {
			sum = sum + score[i];
		}
		
		return sum;
	}
	
	public double average () {
		double average;
		double sum = 0;
		
		for(int i = 0; i < 3; i++) {
			sum = sum + score[i];
		}
		
		average = sum/3;
		return average;
	}
	
	public String GPA () {
		double average;
		double sum = 0;
		
		for(int i = 0; i < 3; i++) {
			sum = sum + score[i];
		}
		
		average = sum/3;
		
		if( average <= 100 && average >= 90 )
			GPA = "A";
		else if( average < 90 && average >= 80)
			GPA = "B";
		else if( average < 80 && average >= 50)
			GPA = "C";
		else if( average < 50 && average >= 20)
			GPA = "D";
		else if( average < 20 && average >= 0)
			GPA = "E";
		else
			System.out.println(" Incorrect Value ");
		
		return GPA;
		
	}
	
}
public class Assignment_1_CSCI428 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Gradebook g1 = new Gradebook();
		
		g1.setName(input.nextLine());
		
		for(int i = 1; i <= 3; i++) {
			g1.setScore(i, input.nextDouble());
		}
		
		g1.calcGrades();
		
		System.out.printf("Name: %s\n"
						+ "Mark of subject 1: %3.0f\n"
						+ "Mark of subject 2: %3.0f\n"
						+ "Mark of subject 3: %3.0f\n"
						+ "======================\n"
						+ "%s\n"
						+ "======================\n"
						+ "Subject 1: %s\n"
						+ "Subject 2: %s\n"
						+ "Subject 3: %s\n"
						+ "----------------------\n"
						+ "Total: %3.2f\n"
						+ "Average: %3.2f\n"
						+ "GPA: %s\n",
						g1.getName(),
						g1.getScore(1),
						g1.getScore(2),
						g1.getScore(3),
						g1.getName(),
						g1.getGrade(1),
						g1.getGrade(2),
						g1.getGrade(3),
						g1.total(),
						g1.average(),
						g1.GPA());
	
	input.close();
	}

}
