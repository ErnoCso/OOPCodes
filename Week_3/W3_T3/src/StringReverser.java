import java.util.Scanner;

public class StringReverser {

	public static void main(String[] args) {
		
		String userInput;
		
		System.out.println("+++++++++++++++++++++++++++ ");
		System.out.println("-                         -");
		System.out.println("-     STRING REVERSER     -");
		System.out.println("-                         -");
		System.out.println("+++++++++++++++++++++++++++\n");

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a sentence: ");
		userInput = scan.nextLine();
		StringBuilder input = new StringBuilder();
		input.append(userInput);
		input.reverse(); 
		System.out.println("\n" + input);
		scan.close();
		
	}

}
