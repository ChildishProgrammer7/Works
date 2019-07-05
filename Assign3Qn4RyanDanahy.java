/*
 * Write a program named ”Assign3Qn4XX” that prompts the user to enter the number of lockers in a school. 
 * After the game is over, the program outputs the number of lockers and the locker numbers of the lockers that are open. 
 * Test run your program for the following inputs: 1000, 5000, and 10,000. 
 * 
 * @author- Ryan Danahy
 * @assignment- CSCI 333 Assignment 3 Qn 4
 * @date- 3/28/18 
 */

import java.util.Scanner;

public class Assign3Qn4RyanDanahy {
	
	public static void main(String[] args) {
		
		//implement a scanner to receive input from user
		Scanner in = new Scanner(System.in);
		System.out.println("How many lockers do you have?");
		
		//declare variables
		int size = in.nextInt();
		int lkr[] = new int[size];
		int open = 0;
		
		
		//initialize all lockers to be closed
		for(int x = 0; x < size; x++) {
			lkr[x] = 0;
		}
		
		//for every student...
		for(int x = 0; x < size; x++) {
			
			//first student opens every locker, 
			//second student close every even locker,
			//nth (including third) student opens or closes every nth (or third) locker
			for(int y = x; y < size; y += x + 1) {
				lkr[y]++;
			}
			
		}
		
		//count how many lockers are open
		for(int x = 0; x < size; x++) {
			if(lkr[x]%2 == 1) { 
				open++;
			}
		}
		
		System.out.printf("Out of %d lockers, %d are open. %n", size, open);
		
	}
}