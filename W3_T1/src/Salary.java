 // ***************************************************************
//  Salary.java
//
//  Computes the amount of a raise and the new
//  salary for an employee.  The current salary
//  and a performance rating (a String: "Excellent",
//  "Good" or "Poor") are input.
//***************************************************************

// Computing A Pay Increase
//
// File Salary.java contains most of a program that takes as input an employee's 
// salary and a rating of the employee's performance and computes the raise for the employee. 
// The performance rating here is being entered as a String—the three possible ratings are "Excellent",
// "Good", and "Poor". An employee who is rated excellent will receive a 6% raise, one rated good will 
// receive a 4% raise, and one rated poor will receive a 1.5% raise.
//
// Add the if... else... statements to program Salary to make it run as described above. 
// Note that you will have to use the equals method of the String class 
// (not the relational operator ==) to compare two strings.


import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
	public static void main(String[] args) {

		String runAgain;
		double currentSalary; // employee's current salary
		double raise = 0; // amount of the raise
		double newSalary; // new salary for the employee
		String rating; // performance rating

		Scanner scan = new Scanner(System.in);
		System.out.println("*******************************************************");
		System.out.println("               SALARY RAISE CALCULATOR                *");
		System.out.println("*******************************************************");
		while (true) {
			System.out.print("\nEnter the current salary: ");
			currentSalary = scan.nextDouble();
			while (true) {
				System.out.print("Enter the performance rating \n(Excellent, Good, or Poor): ");
				rating = scan.next();

				if (rating.equalsIgnoreCase("Excellent")) {
					raise = (0.06 * (currentSalary));
					break;
				} else if (rating.equalsIgnoreCase("Good")) {
					raise = (0.04 * (currentSalary));
					break;
				} else if (rating.equalsIgnoreCase("Poor")) {
					raise = (0.015 * (currentSalary));
					break;
				} else {
					System.err.println("Error! Choose between the next three option:\nExcellent, Good, Poor. ");
				}
			}

			newSalary = currentSalary + raise;

			// Print the results
			NumberFormat money = NumberFormat.getCurrencyInstance();
			System.out.println();
			System.out.println("Current Salary:       " + money.format(currentSalary));
			System.out.println("Amount of your raise: " + money.format(raise));
			System.out.println("Your new salary:      " + money.format(newSalary));
			System.out.println();

			while (true) {
				System.out.print("\nWould you like to enter another salary (Y/N)? ");
				runAgain = scan.next();
				if (runAgain.equalsIgnoreCase("Y")) {
					break;
				} else if (runAgain.equalsIgnoreCase("N")) {
					System.out.println("\nUntil next time! \nBye bye! ");
					scan.close();
					System.exit(0);
				} else {
					System.err.println("\nInvalid character! Please choose between 'Y' or 'N'");
					scan.nextLine();

				}
			}
		}

	}
}


// OUTPUT:

// *******************************************************
// SALARY RAISE CALCULATOR                *
// *******************************************************
//
// Enter the current salary: 34563
// Enter the performance rating 
// (Excellent, Good, or Poor): poor
//
// Current Salary:       £34,563.00
// Amount of your raise: £518.44
// Your new salary:      £35,081.44
//
//
// Would you like to enter another salary (Y/N)? y
//
// Enter the current salary: 53454
// Enter the performance rating 
// (Excellent, Good, or Poor): excellent
//
// Current Salary:       £53,454.00
// Amount of your raise: £3,207.24
// Your new salary:      £56,661.24
//
//
// Would you like to enter another salary (Y/N)? v
//
// Invalid character! Please choose between 'Y' or 'N'
//
// Would you like to enter another salary (Y/N)? n
//
// Until next time! 
// Bye bye! 

