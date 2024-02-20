
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Dice {

	public static void main(String[] args) {

		int die1;
		int die2;
		int rolling1;
		int rolling2;
		int total1 = 0;
		int total2 = 0;
		float avg1;
		float avg2;

		Scanner scan = new Scanner(System.in);
		System.out.println("*******************************************************");
		System.out.println("*                   Dice Statistics                   *");
		System.out.println("*                                                     *");
		System.out.println("*******************************************************");

		Random numbers = new Random();

		while (true) {
			try {
				System.out.print("\nHow many sides does die 1 have? ");
				die1 = scan.nextInt() + 1;
				while (true) {
					try {
						System.out.print("How many sides does die 2 have? ");
						die2 = scan.nextInt() + 1;
						break;
					} catch (InputMismatchException ex) {
						System.err.println("Error! Invalid Data!\nPlease use integer only!");
						scan.next();
					}
				}
				for (int i = 1; i < 4; i++) {
					rolling1 = numbers.nextInt(1, die1);
					total1 += (rolling1);
					if (i == 1) {
						System.out.println("Die 1 first roll = " + rolling1);
						rolling2 = numbers.nextInt(1, die2);
						total2 += (rolling2);
						System.out.println("Die 2 first roll = " + rolling2);
					} else if (i == 2) {
						System.out.println("Die 1 second roll = " + rolling1);
						rolling2 = numbers.nextInt(1, die2);
						total2 += (rolling2);
						System.out.println("Die 2 second roll = " + rolling2);
					} else if (i == 3) {
						System.out.println("Die 1 third roll = " + rolling1);
						rolling2 = numbers.nextInt(1, die2);
						total2 += (rolling2);
						System.out.println("Die 2 third roll = " + rolling2);
					}
				}
				break;
			} catch (InputMismatchException ex) {
				System.err.println("Error! Invalid Data!\nPlease use integer only!");
				scan.next();

			}
		}
		avg1 = (float) total1 / 3;
		avg2 = (float) total2 / 3;
		System.out.println("Die 1 rolled a total of " + total1 + " and rolled " + avg1 + " on average");
		System.out.println("Die 2 rolled a total of " + total2 + " and rolled " + avg2 + " on average");
		scan.close();

	}
}
