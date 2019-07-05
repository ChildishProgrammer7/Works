/*
 * Ryan Danahy
 * Assignment 2 CSCI 428
 * 
 * Problem: A substantial organization pays its sales reps on a commission basis. The sales reps get $100 every week in addition to 10% of their gross sales for that week, 
 * or $200 every week in addition to 8% of their gross sales for that week whichever is greater. For instance, a salesman who sells $6,000 worth of stock in seven days gets $100 in addition 
 * to 10% of $6000, that is an aggregate of $700 (Commission1 ) or gets $200 in addition to 8% of $6000, that is an aggregate of $680 (Commission2). Whichever is greater. 
 * You've been provided with a rundown of the things sold by every sales rep. Build up a Java application that inputs one sales rep's things sold for last week and 
 * computes and shows that salesman's profit. There's no restriction to the quantity of things that can be sold. 
 * 
 */
import java.util.Scanner;
class SalesCommission {
	
	//declarations
	double q1, q2, q3, q4 = 0;
	
	//constructor
	public SalesCommission(double q1, double q2, double q3, double q4) {
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
	}
	//methods
	
	//This method calculates the price of each item depending on the item number given. I used a switch statement to simplified the conditional int item.
	private double calcPrice(int item) {
		double total;
		switch(item) {
		case 1:
			total = q1*239.99;
			return total;
		case 2:
			total = q2*129.75;
			return total;
		case 3:
			total = q3*99.95;
			return total;
		case 4:
			total = q4*350.89;
			return total;
		default:
			// I added this to see if any errors occur
			System.out.println("Error. Item number does not exist.");
			return 0;
		}
	}
	
	//total method add all the prices up to get the total price
	private double total() {
		double total = this.calcPrice(1) + this.calcPrice(2) + this.calcPrice(3) + this.calcPrice(4);
		return total;
	}
	
	//commission method finds the commission from both methods given in the problem then, using a if statement, determines the larger amount to be given to the salesman
	private double commission() {
		double comm1 = (this.total()*.1) + 100;
		double comm2 = (this.total()*.08) + 200;
		
		if(comm1 >= comm2) {
			return comm1;
		}
		else {
			return comm2;
		}
	}
	
	//This method is used to help display the total and commission much easier then just writing it out in the main function in caase it needed to written more than once
	public void display() {
		
		System.out.printf("\nTotal Sale: $%,.2f\n", this.total());
		System.out.printf("Commission: $%,.2f\n\n", this.commission());
		
	}
}
public class Assignment_2_CSCI428 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//I put a scanner into the main function for the user to input the quantity of each item
		Scanner in = new Scanner (System.in);
		
		//declaration for termination conditions
		int quit = 0;
		while(quit != 1) {
			
			//Main function declarations
			int size = 1;
			double q1 = 0, q2 = 0, q3 = 0, q4 = 0;
				
			// this loops 4 times for the user to input the numbers 
			while (size <= 4) {
				System.out.printf("Please enter item %d quantity sold: ", size);
				switch(size) {
				case 1:
					q1 = in.nextDouble();
					break;
				case 2:
					q2 = in.nextDouble();
					break;
				case 3:
					q3 = in.nextDouble();
					break;
				case 4:
					q4 = in.nextDouble();
					break;
				default:
					System.out.println("\nError. Number should not exist in this loop.");
					break;
				}
				//System.out.println("");
				size++;
			}
		
			//declaration of the class that holds all the methods written up above.
			SalesCommission sale = new SalesCommission(q1, q2, q3, q4);
		
			//uses function display that uses all the other methods into the function
			sale.display();
		
			// ask the user for input determining their wishes for terminating function or not
			System.out.println("Wish to terminate function? 1 for yes, 0 for no");
			quit = in.nextInt();
		}
		
		//needed to stop the scanner search for user input 
		in.close();
	}
}
