// Task_1

// Computing A Pay Increase

// File Salary.java contains most of a program that takes as input an employee's salary and 
// a rating of the employee's performance and computes the raise for the employee. 
// The performance rating here is being entered as a String—the three possible ratings are 
// "Excellent", "Good", and "Poor". An employee who is rated excellent will receive a 6% raise, 
// one rated good will receive a 4% raise, and one rated poor will receive a 1.5% raise.

// Add the if... else... statements to program Salary to make it run as described above. 
// Note that you will have to use the equals method of the String class 
// (not the relational operator ==) to compare two strings.

// ***************************************************************
//  Salary.java
//
//  Computes the amount of a raise and the new
//  salary for an employee.  The current salary
//  and a performance rating (a String: "Excellent",
//  "Good" or "Poor") are input.
//***************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Salary
{	
  public static void main (String[] args)
  {
	  
	  
      double currentSalary; // employee's current  salary
      double raise = 0;     // amount of the raise
      double newSalary;     // new salary for the employee
      String rating;		// performance rating
            
      Scanner scan = new Scanner(System.in);
      System.out.println("*******************************************************");
      System.out.println("               SALARY RAISE CALCULATOR                *");
      System.out.println("*******************************************************");

      System.out.print ("\nEnter the current salary: ");
      currentSalary = scan.nextDouble();
      while(true) {      
    	  System.out.print ("Enter the performance rating \n(Excellent, Good, or Poor): ");
	      rating = scan.next();
	      
	      if (rating.equalsIgnoreCase("Excellent")) {
	    	  raise = (0.06 *( currentSalary));
	    	  break;
	      } 
	      else if (rating.equalsIgnoreCase("Good")) {
	    	  raise = (0.04 *(currentSalary));
	    	  break;
	      }
	      else if (rating.equalsIgnoreCase("Poor")) {
	    	  raise = (0.015 *(currentSalary));
	    	  break;
	      }
	      else { 
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
      scan.close();
   
  }
}
