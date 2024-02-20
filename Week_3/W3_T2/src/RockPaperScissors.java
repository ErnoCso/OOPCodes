// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

   public static void main(String[] args)
   {
	   
       System.out.println("\t     ___________________________");
       System.out.println("\t    /                           \\ ");		
       System.out.println("\t   (     Rock,Paper,Scissors     )");
       System.out.println("\t    \\___________________________/ \n");
       System.out.println("======================================================\n");
	   
       while(true) {
		   String runAgain;
		   String personPlay;    //User's play -- "R", "P", or "S"
		   String computerPlay = "";  //Computer's play -- "R", "P", or "S"
		   int computerInt;      //Randomly generated number used to determine
		                      //computer's play
	
		   Scanner scan = new Scanner(System.in);
		   Random generator = new Random();
		   

	       System.out.println("\nPlease choose between Rock(R) or Paper(P) or Scissor(S)");
	       while (true) {
	   		//Get player's play -- note that this is stored as a string
	    	//Make player's play uppercase for ease of comparison
	           personPlay = scan.nextLine().toUpperCase();  	// I would have chosen the equalsIgnoreCase() method rather than 
			   if (personPlay.equals("R")) {					// the upperCase() method, but if this is the task, 
				   System.out.println("Player's choice: Rock");	// then this is the task.
				   break;
			   } else if (personPlay.equals("P")) {
				   System.out.println("Player's choice: Paper");
				   break;
			   } else if (personPlay.equals("S")) {
				   System.out.println("Player's choice: Scissor");
				   break;
			   } else { 
				   System.err.println("Error! Invalid character! " 
			   + "\nPlease choose between R or P or S");
			   }
	       }
			//Generate computer's play (0,1,2)
			//Translate computer's randomly generated play to string
	       int upperbound = 3;
	       computerInt = generator.nextInt(upperbound);
		   switch (computerInt) {
		   case 0:
			   computerPlay = "R";
			   System.out.println("Computer's choice: Rock");
			   break;
		   case 1:
			   computerPlay = "P";
			   System.out.println("Computer's choice: Paper");
			   break;
		   case 2:
			   computerPlay = "S";
			   System.out.println("Computer's choice: Scissor");
			   break;
		   }
		//Print computer's play
		//See who won.  Use nested ifs instead of &&.
		//...  Fill in rest of code
		if (personPlay.equals(computerPlay))  
		    System.out.println("It's a tie!");
		else if (personPlay.equals("R"))
		    if (computerPlay.equals("S"))
			System.out.println("Rock crushes scissors.  You win!!");
		    else System.out.println("Paper wrap the rock. You loose!");
		else if (personPlay.equals("S"))
		    if (computerPlay.equals("P"))
			System.out.println("Scissor cut the papers.  You win!!");
		    else System.out.println("Rock crushes scissors. You loose!");
		else if (personPlay.equals("P"))
		    if (computerPlay.equals("R"))
			System.out.println("Scissor cut the papers.  You win!!");
		    else System.out.println("Scissor cut the papers.  You loose!");
		while(true) {
			System.out.print("\nWould you like to play again (Y/N)? ");
			runAgain = scan.next(); 
			if (runAgain.equalsIgnoreCase("Y")) {
				break;				
			}
			else if (runAgain.equalsIgnoreCase("N")) {
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

