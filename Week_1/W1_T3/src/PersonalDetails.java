
//	3) Create a second project called “PersonalDetails” and write a program that outputs
//	   some personal details to the screen, e.g., Name, Address, Age, Phone number etc.

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
        System.out.print("\nEnter your full name: " );
        name = scan.nextLine();
        System.out.println("Enter your address " );
        System.out.print("House Number, Street Name: ");
        addrHouse = scan.nextLine();
        System.out.print("City and County name: ");
        addrCity = scan.nextLine();
        System.out.print("PostCode: ");
        addrPost = scan.nextLine();
        System.out.print("Enter your age in integers: " );
        age = scan.nextInt();
        System.out.print("Enter your phone number: " );
        phone = scan.next();
        System.out.print("Enter your email address: " );
        email = scan.next();

        scan.close();
       
 
        System.out.println("\nYour details: " + "\n============="+ "\n\nName: \t\t" + name + 
        		"\n\nAddress: \t" + addrHouse + "\n\t\t" + addrCity + "\n\t\t" + addrPost + 
        		"\n\nAge: \t\t" + age + " years old" + "\n\nPhone no: \t" + phone + 
        		"\n\nEmail addr: \t" + email);
	}

}

//	Output:
//	
//	Your details: 
// =============
//
// Name: 		James Bond
//
// Address: 	01. Magic Java Road
//				Leeds
//				LS1 1AA
//
// Age: 		24 years old
//
// Phone no: 	07462385129
//
// Email addr: 	magicalworld@magic.ac.uk