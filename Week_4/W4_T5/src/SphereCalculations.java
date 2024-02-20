// Task: 

// Write and application that reads the radius of a sphere and prints its volume and surface area. 
// Use the following formulas, where r represents the radius of the sphere. 
// Print the output to four decimal places.
// 
// Volume =  4πr3 / 3
//
// Surface area = 4πr2


import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class SphereCalculations {
	
	public static void main(String[] args) {
		
		float radius;
		double volume;
		double surface;

		System.out.println("************************");
		System.out.println("*  Sphere Calculation  *");
		System.out.println("*                      *");
		System.out.println("************************\n");
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("\nPlease enter the radius of sphere: ");
				radius = scan.nextFloat();
				if (radius < 0) {
					System.err.println("Error! Invalid data!\nPlease use positive numbers!");
					scan.nextLine();
					continue;
				}
				if (radius == 0) {
					System.err.println("Error! Invalid data!\nZero is not a positive numbers!");
					scan.nextLine();
					continue;
				}
				
		        DecimalFormat frmt = new DecimalFormat(".####");
				volume  = ((4 * (Math.PI * (Math.pow(radius, 3))))/3);
				surface = (4 * (Math.PI * (Math.pow(radius, 2))));
				System.out.println("\nVolume of the sphere: " + frmt.format(volume));
				System.out.println("Surface of the sphere: " + frmt.format(surface));
				scan.close();
				System.exit(0);

			} catch (InputMismatchException ex) {
				System.err.println("Error!!! Invalid data!\nPlease use pozitiv numbers only !");
				scan.next();
			}
		}
	}

}


// ************************
// *  Sphere Calculation  *
// *                      *
// ************************
//
//
// Please enter the radius of sphere: eter
// Error!!! Invalid data!
// Plese use pozitiv numbers only !
// 
// Please enter the radius of sphere: -3342
// Error! Invalid data!
// Please use positive numbers!
//
// Please enter the radius of sphere: 34n
// Error!!! Invalid data!
// Please use pozitiv numbers only !
//
// Please enter the radius of sphere: 0000
// Error! Invalid data!
// Zero is not a positive numbers!
//
// Please enter the radius of sphere: 0
// Error! Invalid data!
// Zero is not a positive numbers!
//
// Please enter the radius of sphere: 0.654
//
// Volume of the sphere: 1.1717
// Surface of the sphere: 5.3748