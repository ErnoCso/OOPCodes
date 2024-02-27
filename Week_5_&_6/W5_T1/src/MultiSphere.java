// Task_1

// Sphere

// Design and implement a class called Sphere that contains instance data that represent a sphere’s diameter.
// Define a Sphere constructor to accept and initialize the diameter.
// Include getter and setter methods for the diameter.
// Include methods to calculate and return the volume and surface area of the sphere.
// Include a toString method that returns a one-line description of the sphere.
// Create a driver class (main class) called MultiSphere, 
// whose main method instantiates and updates several Sphere objects.


import java.util.Scanner;

public class MultiSphere {

	public static void main(String[] args) {
		
		System.out.println("*****************************************");
		System.out.println("*                SPHERE                 *");
		System.out.println("*                                       *");
		System.out.println("*        Volume and surface area        *");
		System.out.println("*              of ​​a sphere              *");
		System.out.println("*****************************************");

		
		double diameter;
		double diameter2;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("\n\nPlease enter the diameter of Sphere: ");
		diameter = scan.nextDouble();
		
		Sphere sphere1 = new Sphere(diameter);
		System.out.println("\nInitial Sphere: " + sphere1.toString());
		System.out.printf("Sphere Volume: " + "%,.2f",sphere1.Volume());
		System.out.printf("\nSphere Surface: " + "%,.2f",sphere1.Surface());
		

		System.out.print("\n\nPlease enter another diameter of Sphere: ");
		diameter2 = scan.nextDouble();
		
		sphere1.setDiameter(diameter2);
		System.out.println("\nUpdated Sphere: " + sphere1.toString());
		
		System.out.printf("Sphere Volume: " + "%,.2f",sphere1.Volume());
		System.out.printf("\nSphere Surface: " + "%,.2f",sphere1.Surface());

		scan.close();
		
	}

}

// Output:

// *****************************************
// *                SPHERE                 *
// *                                       *
// *        Volume and surface area        *
// *              of ​​a sphere              *
// *****************************************
//
//
// Please enter the diameter of Sphere: 34
//
// Initial Sphere: 
// Diameter: 34.0
// Sphere Volume: 20,579.53
// Sphere Surface: 3,631.68
//
// Please enter another diameter of Sphere: 45
//
// Updated Sphere: 
// Diameter: 45.0
// Sphere Volume: 47,712.94
// Sphere Surface: 6,361.73
