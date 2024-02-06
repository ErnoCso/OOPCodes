// Task_5
// 
// Fraction Write an application that prompts and reads the numerator and 
// denominator of a fraction as integers and then prints the decimal equivalent of the fraction.

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" ////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("<<               FRACTION               >>");
		System.out.println(" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////////");
		while (true) {
			try {

				System.out.print("\nPlease enter the numerator of the fraction: ");
				int a = scan.nextInt();
				System.out.print("Please enter the denominator of the fraction: ");
				int b = scan.nextInt();

				float decimal = (float) a / b;
				System.out.printf("\nThe decimal equivalent of the fraction: " + "%,.3f", decimal);
				break;

			} catch (Exception InputMismatchExcemption) {
				System.err.println("\nError! Please use integers only!");
				scan.nextLine();
			}
		}
		scan.close();

   
	}

}


// Output:
//
//  ////////////////////\\\\\\\\\\\\\\\\\\\\
// <<               FRACTION               >>
//  \\\\\\\\\\\\\\\\\\\\////////////////////
//
// Please enter the numerator of the fraction: 23
// Please enter the denominator of the fraction: 12
//
// The decimal equivalent of the fraction: 1.917