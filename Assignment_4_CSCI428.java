//Ryan Danahy
import java.util.ArrayList;
import java.util.Arrays;

class Grade {
	
	//methods
	
	//method sorts array names then display both arrays
	public void sortAndDisplay(String[] n, ArrayList<Double> g) {
		Arrays.sort(n);
		for(int i = 0; i <= 5; i++) {
			System.out.printf("%s -> %1.1f\n", n[i], g.get(i));
		}
	}
	
}

public class Assignment_4_CSCI428 {

	public static void main(String[] args) {
		//declaration
		String[] name = new String[5];
		ArrayList<Double> gpa = new ArrayList<Double>();
		
		//put in student names
		name[0] = "D";
		name[1] = "C";
		name[2] = "B";
		name[3] = "A";
		name[4] = "E";
		
		//put in gpa scores
		gpa.add(3.4);
		gpa.add(3.9);
		gpa.add(4.0);
		gpa.add(4.0);
		gpa.add(3.0);
		
		//class declaration
		Grade list = new Grade();
		
		//declare method to sort names and display the values
		list.sortAndDisplay(name, gpa);
	}

}
