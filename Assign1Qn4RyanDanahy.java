/*
 * Write a program that prompts the user to input an integer between 0 and 35. 
 * If the number is less than or equal to 9, the program should output the number; 
 * otherwise, it should output A for 10, B for 11, C for 12, . . ., and Z for 35. 
 * (Hint: Use the cast operator, (char)( ), for numbers >= 10.)
 * 
 * @author Ryan Danahy
 * @assignment CSCI 333 Assignment 1 Qn 4 
 * @date 1/30/18
 */

import java.util.Scanner;

public class Assign1Qn4RyanDanahy {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a number between 0 and 35.");
		Scanner userinput = new Scanner(System.in);
		int input = userinput.nextInt();
		userinput.close();
		
		if (input <=9) {
			System.out.println("Your number is... " + input);
		}
		else if (input >= 10 && input <= 35) {
			System.out.println("Your new value is... " + (char)(input + 55));
		}
		
		System.out.println("Your original number was... " +input);
		
	}
}
