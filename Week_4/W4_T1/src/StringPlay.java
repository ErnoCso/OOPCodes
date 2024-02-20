
public class StringPlay
{
   public static void main (String[] args)
   
   {
	  System.out.println("*****************************************");
	  System.out.println("*            StringPlay.java            *");
	  System.out.println("*                                       *");
	  System.out.println("*       Play with String objects        *");
	  System.out.println("*****************************************");
	   
	      
      String college = new String ("Leeds Beckett University"); //Similar for part (a)

      String town = " Leeds, UK"; // part (a)

      String change1, change2, change3; 
      
      int stringLength = college.length(); // part (b)

      System.out.println (college + " contains " + stringLength + " characters.");

      change1 = college.toUpperCase(); // part (c)

      change2 = change1.toLowerCase().replace('e','*'); // part (d)

      change3 = college.concat(town); // part (e)

      System.out.println ("The final string is " + change1);
      System.out.println ("The final string is " + change2);
      System.out.println ("The final string is " + change3);

    }
}
