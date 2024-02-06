// Task_4
//
// Square Calculations
//
// Write an application that prompts for and reads integer representing 
// the length of a square’s side, then prints the square’s perimeter and area.


import java.util.Scanner;

public class ScquareCalculations {
	
	public static void main(String[] args)
	    {
		
		Scanner scan = new Scanner(System.in) ;
        System.out.println("==============================================");
        System.out.println("=<           Square Calculations            >=");
        System.out.println("==============================================");
        System.out.print("\nPlease enter the length of square's side: ");
        float a = scan.nextFloat();
        scan.close();
        float perimeter = (a*4);
        float area = a*a;
        System.out.printf("\nThe square's perimeter: " + "%,.2f", perimeter); 
        System.out.printf("\nThe square's area: " + "%,.2f", area);
       
		}

	}

// Output:

// ==============================================
// =<           Square Calculations            >=
// ==============================================
//
// Please enter the length of square's side: 23.6
//
// The square's perimeter: 94.40
// The square's area: 556.96