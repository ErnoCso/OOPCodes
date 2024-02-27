// Task_2

// Books

// Design and implement a class called Book that contains instance data for title, 
// author, publisher and copyright date.
// Define that Book constructor to accept and initialize these data.
// Include setter and getter methods for all instance data.
// Include a toString method that returns a nicely formatted, multiline description of the book.
// Create a driver class called Bookshelf, whose main method instantiates and updates several Book objects.


import java.util.Scanner;

public class Bookshelf {

	public static void main(String[] args) {

		System.out.println("****************************************");
		System.out.println("*                BOOKS                 *");
		System.out.println("*                                      *");
		System.out.println("*       Title, Author, Publisher       *");
		System.out.println("*          and Copyright Date          *");
		System.out.println("****************************************");

		String title, author, publisher, copyrightDate;
		String title2, author2, publisher2, copyrightDate2;

		Scanner scan = new Scanner(System.in);

		System.out.print("\nPlease enter the title of book: ");
		title = scan.nextLine();
		System.out.print("Please enter the author of book: ");
		author = scan.nextLine();
		System.out.print("Please enter the publisher of book: ");
		publisher = scan.nextLine();
		System.out.print("Please enter the copyright date of book: ");
		copyrightDate = scan.nextLine();

		Book book1 = new Book(title, author, publisher, copyrightDate);
		System.out.println("\nBook details: " + book1.toString());

		System.out.print("\nPlease enter another book details ");
		System.out.print("\n\nPlease enter title of book: ");
		title2 = scan.nextLine();
		System.out.print("Please enter author of book: ");
		author2 = scan.nextLine();
		System.out.print("Please enter publisher of book: ");
		publisher2 = scan.nextLine();
		System.out.print("Please enter copyright date of book: ");
		copyrightDate2 = scan.nextLine();

		book1.setBook(title2, author2, publisher2, copyrightDate2);
		System.out.print("\nUpdated Book details: " + book1.toString());

		scan.close();

	}

}


// Output:

// ****************************************
// *                BOOKS                 *
// *                                      *
// *       Title, Author, Publisher       *
// *          and Copyright Date          *
// ****************************************
//
// Please enter the title of book: Merchant of Venice
// Please enter the author of book: William Shakespeare
// Please enter the publisher of book: Simon & Schuster
// Please enter the copyright date of book: 06.15.2010
//
// Book details: 
//
// Title: 		   Merchant of Venice
// Author: 	       William Shakespeare
// Publisher: 	   Simon & Schuster
// Copyright Date: 06.15.2010
//
// Please enter another book details 
//
// Please enter title of book: Harry Potter and the Philosopher's Stone
// Please enter author of book: J.K.Rowling
// Please enter publisher of book: Bloomsbury
// Please enter copyright date of book: 26.June.1997
//
// Updated Book details: 
//
// Title: 		   Harry Potter and the Philosopher's Stone
// Author: 	       J.K.Rowling
// Publisher: 	   Bloomsbury
// Copyright Date: 26.June.1997