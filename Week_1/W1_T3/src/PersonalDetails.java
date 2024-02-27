// Task_1

// Personal Details
// Create a second project called “PersonalDetails” and write a program that outputs
// some personal details to the screen, e.g., Name, Address, Age, Phone number etc.

import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {

		String name;
		int age;
		String phone;
		String email;
		String addrHouse;
		String addrCity;
		String addrPost;

		Scanner scan = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("=<       Personal Details       >=");
		System.out.println("==================================");
		System.out.print("\nEnter your full name: ");
		name = scan.nextLine();
		System.out.println("Enter your address ");
		System.out.print("House Number, Street Name: ");
		addrHouse = scan.nextLine();
		System.out.print("City and County name: ");
		addrCity = scan.nextLine();
		System.out.print("PostCode: ");
		addrPost = scan.nextLine();
		System.out.print("Enter your age in integers: ");
		age = scan.nextInt();
		System.out.print("Enter your phone number: ");
		phone = scan.next();
		System.out.print("Enter your email address: ");
		email = scan.next();

		scan.close();

		System.out.println("\nYour details: " + "\n=============" + "\n\nName: \t\t" + name + "\n\nAddress: \t"
				+ addrHouse + "\n\t\t" + addrCity + "\n\t\t" + addrPost + "\n\nAge: \t\t" + age + " years old"
				+ "\n\nPhone no: \t" + phone + "\n\nEmail addr: \t" + email);
	}
}

// Output:
//	
// ==================================
// =<       Personal Details       >=
// ==================================
//
// Enter your full name: James Bond 
// Enter your address 
// House Number, Street Name: 07 Secret Street
// City and County name: Leeds, West Yorkshire
// PostCode: LS0 7AA
// Enter your age in integers: 24
// Enter your phone number: 07070070000
// Enter your email address: secretagent@secret.ac.uk
//
// Your details: 
// =============
//
// Name: 	James Bond 
//
// Address: 	07 Secret Street
// 		Leeds, West Yorkshire
// 		LS0 7AA
//
// Age: 	24 years old
//
// Phone no: 	07070070000
//
// Email addr: 	secretagent@secret.ac.uk
