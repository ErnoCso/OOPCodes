import java.util.Scanner;
import java.io.*;

public class PunctuationMarks {

	public static void main(String[] args) {
		
		String text;
		int count = 0 ;
		int periodCount = 0;
		int commaCount = 0;
		int questionCount = 0;
		int exclmationCount = 0;
		int colonCount = 0;
		int semiCCount = 0;
		int hyphenCount = 0;
		int quotationMCount = 0;
		int apostropheCount = 0;
		String colorGreen = "\u001B[32m";
		String colorWhite = "\u001B[0m";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t###################################");
		System.out.println("\t#                                 #");
		System.out.println("\t#    Punctuation Marks Counter    #");
		System.out.println("\t#                                 #");
		System.out.println("\t###################################\n");

		text = """
				Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go.
				-that was a nice poem- 
				the end. """;
		
		for (int i = 0; i < text.length(); i++) {
			
			if (text.charAt(i) == '.' ) {
				periodCount++;	
			}
			if (text.charAt(i) == ',' ) {
				commaCount++;	
			}
			if (text.charAt(i) == '?' ) {
				questionCount++;
				
			}if (text.charAt(i) == '!' ) {
				exclmationCount++;
				
			}if (text.charAt(i) == ':' ) {
				colonCount++;
				
			}if (text.charAt(i) == ';' ) {
				semiCCount++;
				
			}if (text.charAt(i) == '-' ) {
				hyphenCount++;
				
			}if (text.charAt(i) == '"' ) {
				quotationMCount++;
				
			}if (text.charAt(i) == '\'' ) {
				apostropheCount++;
				
			}
		}	
		count = (apostropheCount + quotationMCount +hyphenCount + semiCCount + colonCount 
				+ exclmationCount + questionCount + commaCount + periodCount);
		
		System.out.println(colorGreen + "\nThe string : \n\n" + colorWhite + text);

		
		System.out.println(colorGreen + "\nThe Number of punctuations exists in the string is: " + count + colorWhite + "\n\nPeriod: \t\t" + periodCount
				+ "\nComma: \t\t\t" + commaCount + "\nQuestion Mark:  \t" + questionCount + "\nExclamation Mark: \t" + exclmationCount 
				+ "\nColon: \t\t\t" + colonCount + "\nSemicolon: \t\t" + semiCCount + "\nHyphen: \t\t" + hyphenCount + "\nQuotation MarkS: \t" 
				+ quotationMCount + "\nApostrophe: \t\t" + apostropheCount);
	}

}
