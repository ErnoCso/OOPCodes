import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class PinEncryption {

	public static void main(String[] args) {

		int pin;
		int firstNr;
		int lastNr;

		System.out.println("*********************");
		System.out.println("*  PIN Encryption   *");
		System.out.println("*                   *");
		System.out.println("*********************\n\n");
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Please enter a 4 digit PIN number to encrypt: ");
				pin = scan.nextInt();
				int length = Integer.toString(pin).length();

				if (pin < 0) {
					System.err.println("Error! Invalid data!\nPlease use positive integers!");
					scan.nextLine();
					continue;
				}
				if (pin == 0) {
					System.err.println("Error! Invalid data!\nZero is not a positive integer!");
					scan.nextLine();
					continue;
				}
				if (length != 4 && length != 0) {
					System.err.println("Please enter only 4-digit integer PIN!\nTry agian!");
					scan.nextLine();
					continue;
				}
				Random numbers = new Random();
				firstNr = numbers.nextInt(1000, 65536);
				lastNr = numbers.nextInt(1000, 65536);
				System.out.println("\nYour encrypted PIN number is " + Integer.toHexString(firstNr)
						+ Integer.toHexString(pin) + Integer.toHexString(lastNr));
				scan.close();
				System.exit(0);

			} catch (InputMismatchException ex) {
				System.err.println("Error!!! Invalid data!\nPlease use pozitiv integers only");
				scan.next();
			}
		}
	}

}


//**************Another solution for the PIN length.**************************************************					
//if (pin  > 9999 ) {
//System.err.println("Error! Invalid data!\nPlease enter only 4-digit integer PIN!");
//scan.nextLine();
//continue;
//}	
//*****************************************************************************************************				


// Output:
// 
// *********************
// *  PIN Encryption   *
// *                   *
// *********************
//
//
// Please enter a 4 digit PIN number to encrypt: wrewr
// Error!!! Invalid data!
// Please use pozitiv integers only
// Please enter a 4 digit PIN number to encrypt: w
// Error!!! Invalid data!
// Please use pozitiv integers only
// Please enter a 4 digit PIN number to encrypt: -34
// Error! Invalid data!
// Please use positive integers!
// Please enter a 4 digit PIN number to encrypt: -3421
// Error! Invalid data!
// Please use positive integers!
// Please enter a 4 digit PIN number to encrypt: ````
// Error!!! Invalid data!
// Plese use pozitiv integers only
// Please enter a 4 digit PIN number to encrypt: 0000
// Error! Invalid data!
// Zero is not a positive integer!
// Please enter a 4 digit PIN number to encrypt: 00000
// Error! Invalid data!
// Zero is not a positive integer!
// Please enter a 4 digit PIN number to encrypt: 10000
// Please enter only 4-digit integer PIN!
// Try agian!
// Please enter a 4 digit PIN number to encrypt: 1000
//
// Your encrypted PIN number is e0d63e8a956
