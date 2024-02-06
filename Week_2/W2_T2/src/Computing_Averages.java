// Task_2
// 
// Computing Averages The following program reads three integers and prints the average. 
// Fill in the blanks so that it will work correctly.


import java.util.Scanner;

public class Computing_Averages
{
    public static void main(String[] args)
    {
       double average;
       
       Scanner scan = new Scanner(System.in) ;
       System.out.println("============================================================");
       System.out.println("=<                Average of three integer                >=");
       System.out.println("============================================================");
       System.out.println("\nPlease enter three integers and " +
                       "I will compute their average.");
       System.out.print("\nEnter first value: ");
       int a = scan.nextInt();
       System.out.print("Enter second value: ");
       int b = scan.nextInt();
       System.out.print("Enter third value: ");
       int c = scan.nextInt();
       scan.close();
       average = (float)(a+b+c)/3;
       String formattedNumber = String.format("%.2f", average);
       System.out.println("\nThe average is " + formattedNumber);
       
	}

}


// ============================================================
// =<                Average of three integer                >=
// ============================================================
//
// Please enter three integers and I will compute their average.
//
// Enter first value: 23
// Enter second value: 34
// Enter third value: 67
//
// The average is 41.33
