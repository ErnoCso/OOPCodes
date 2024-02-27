// Task_3
// 
// Miles to Kilometres
// Write an application that converts miles to kilometres.
// (One mile equals 1.60935 km). 
// Read the miles from the user as a floating point value.

import java.util.Scanner;

public class MilesToKilometers {

	public static void main(String[] args) {

		float miles;
		float kilometres;
		float convNum = 1.60935f;
		
	       Scanner scan = new Scanner(System.in);
	       System.out.println("===============================================");
	       System.out.println("=< Calculator to convert miles to kilometres >=");
	       System.out.println("===============================================");
	       System.out.print("\nPlease enter the miles: " );

	       miles = scan.nextFloat();
	       scan.close();
	       
	       kilometres = miles*convNum;
	       System.out.println("\n" + miles + " miles = " + kilometres + " kilometres");
	}
}

// Output:
// 
// ===============================================
// =< Calculator to convert miles to kilometres >=
// ===============================================
//
// Please enter the miles: 23
//
// 23.0 miles = 37.01505 kilometres
