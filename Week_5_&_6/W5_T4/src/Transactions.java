// Task_4

// Account

// Modify the Account class from the unit examples so that it also permits an account 
// to be opened with just a name and an account number, assuming an initial balance of zero. 
// Modify the main method of the Transactions class to demonstrate this new capability.

// ********************************************************************
//   Transactions.java       Java Foundations
//
//   Demonstrates the creation and use of multiple Account objects.
// ********************************************************************
// import java.util.Scanner;

public class Transactions
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args) {
	   
//	   long acctNumber;
//	   long balance;
//	   String name;
	   
//	   Scanner scan = new Scanner(System.in);
	   
//	   System.out.print("\nPlease type the account number: ");
//	   acctNumber = scan.nextLong();
//	   scan.nextLine();
	   
//	   System.out.print("Please enter the name of the account holder: ");
//	   name = scan.nextLine();
//	   scan.close();
	   
//	   System.out.print("Please enter the balance of the account holder: ");
//	   balance = scan.nextLine();
//	   scan.close();
	   

	   Account acct1 = new Account ("William Smith", 45298, 200.30); // name, acctNumber, balance
       Account acct2 = new Account ("Angelica Adams", 69713, 500.00);
       Account acct3 = new Account ("Edward Demsey", 93757, 769.32);

       acct1.deposit (44.10);  // return value ignored

       double adamsBalance = acct2.deposit (75.25);
       System.out.println ("\nAdams balance after deposit: " +
                          adamsBalance);

       System.out.println ("Adams balance after withdrawal: " + 
                          acct2.withdraw (480, 1.50));
	   
       System.out.println("\nAccount Nr. \tName\t\t\tBalance ");

       acct3.withdraw (-100.00, 1.50);  // invalid transaction

       acct1.addInterest();
       acct2.addInterest();
       acct3.addInterest();

       System.out.println ();
       System.out.println (acct1);
       System.out.println (acct2);
       System.out.println (acct3);
   }
}


// Output:

// Adams balance after deposit: 575.25
// Adams balance after withdrawal: 93.75
//
// Account Nr. 	Name			    Balance 
//
//
// 45298		William Smith		£252.95
//
// 69713		Angelica Adams		£97.03
//
// 93757		Edward Demsey		£796.25
