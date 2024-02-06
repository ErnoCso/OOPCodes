
// 	2) “Test”. Enter, compile and run the following application.

//	Introduce the following errors, one at a time. Note any messages that the compiler produces. 
//	Fix the previous error each time. If no error messages are produced, be prepared to explain why.
	
public class Test
{
	
	public static void main (String[] args)
   {
		System.out.println("----------------------");
		System.out.println("|         TEST       |");
		System.out.println("----------------------");

        System.out.println ("\nAn Emergency Broadcast");
   }
  
}

//	Output:

//	----------------------
//	|         TEST       |
//	----------------------
//	
//	An Emergency Broadcast

// a) Change Test to test
// 
// Output:
// 
// Error: Could not find or load main class Test
// Caused by: java.lang.NoClassDefFoundError: test (wrong name: Test)
//
// The public type test must be defined in its own file
// 2 quick fixes available:
//      Rename file to 'test.java'
//      Rename type to 'Test'
//

// b) Change Emergency to emergency.
//
// Output:
// 
// An emergency Broadcast
//
// Replacing an upper case initial letter with a lower case letter between the quotation marks
// will not cause an error, as this is just a string to Java and not code that it should interpret.
//

// c) Remove the first quotation mark in the string.
//
//  Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
// 			Syntax error, insert ")" to complete MethodInvocation
// 			Syntax error, insert ";" to complete BlockStatements
// 			An cannot be resolved to a variable
// 			Emergency cannot be resolved to a type
// 			Syntax error, insert ";" to complete LocalVariableDeclarationStatement
// 			String literal is not properly closed by a double-quote
// 			String literal is not properly closed by a double-quote
//
// at Test.main(Test.java:9)
//

// d) Change main to man
// 
// Output:
// 
// Error: Main method not found in class Test, please define the main method as:
// public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application
//
 
// e) Change println to bogus
// 
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
// The method bogus(String) is undefined for the type PrintStream
// at Test.main(Test.java:9)
//

// f) Remove the semicolon at the end of the println statement
//
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
// Syntax error, insert ";" to complete BlockStatements
// at Test.main(Test.java:9)
// 

// g) Remove the last brace in the program
//
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		   Syntax error, insert "}" to complete ClassBody
//         at Test.main(Test.java:10)
// 