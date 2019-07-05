/*
 * Write a program that prompts the user to input the following information 
 * and then output the cost of framing the picture: 
 * a. The length and width, in inches, of the picture. 
 * b. The type of the frame. 
 * c. Customers choice of color to color the frame. 
 * d. If the user wants to add the crowns, then the number of crowns.
 * 
 * @author- Ryan Danahy
 * @assignment- CSCI 333 Assignment 2 Qn 6
 * @date- 2/28/18 
 */

import java.io.*;
import java.util.Scanner;

public class Assign2Qn6RyanDanahy {
	
	public static void main(String[] args) {
		
		//declaring variables
		double length;
		double width;
		char type;
		String color;
		int crowns;
		double frameCost;
		double totalCost;
		
		//declare scanner to input variables
		Scanner in = new Scanner(System.in);
		
		//get input of variables 
		System.out.print("Enter the length and width of the picture: ");
		length = in.nextDouble();
		width = in.nextDouble();
		System.out.print("Please choose the type of the frame, r or R (Regular), f or F (Fancy): ");
		type = in.next().charAt(0);
		System.out.print("Enter the color to color the frame: ");
		color = in.next();
		System.out.print("Enter the number of crowns: ");
		crowns = in.nextInt();
		
		//compute area
				double area = length * width;
		
		//compute costs
				double colorCost = 0.10*length + 0.10*width + 0.10*1;
				double crownCost = 0.35*crowns;
				double boardCost = 0.02*area;
		
		//switch statement for whether its fancy or regular and compute total cost
		switch(type) {
			case 'r':
			case 'R':
				//System.out.println("regular");
				frameCost = 0.15*length + 0.15*width + .15;
				totalCost = frameCost + colorCost + crownCost + boardCost;
				System.out.println("Amount Due: $" + totalCost);
				break;
			case 'f':
			case 'F':
				//System.out.println("fancy");
				frameCost = 0.25*length + 0.25*width + .25;
				totalCost = frameCost + colorCost + crownCost + boardCost;
				System.out.println("Amount Due: $" + totalCost);
				break;
		}
		
		//close scanner
		in.close();
	}
}