// Write and application that prints the following diamond shape. 
// Don’t print any unneeded characters.
// 
//               *
// 	            ***
// 	           *****
// 	          *******
//             *****
//              ***
//               *


public class DiamondShape {
	
	public static void main(String[] args) {
	

        System.out.println("===================================");
        System.out.println("=<            DIAMOND            >=");
        System.out.println("===================================\n");


        int n = 7;
        int s = 6;
        
        for (int x = 1; x <= n; x+=2) {
        	for (int y = -11; y < s; y++) {
        		System.out.print(" ");
        	} 
        	for (int y = 0; y < x; y++) { 
        		System.out.print("*");
        		
        	}
        	System.out.println();
        	s -= 1;
        
        }
        s = 1;
        
        for (int x = n-2; x >= 1; x -= 2) {
        	for (int y = -14; y < s; y++) {
        		System.out.print(" ");
        	} 
        	for (int y = 0; y < x; y += 1) { 
        		System.out.print("*");
        		
        	}
	        System.out.println();
	        s +=1;
        }
	}

}



// Output:
// 
// ===================================
// =<            DIAMOND            >=
// ===================================
// 
//                  *
//                 ***
//                *****
//               *******
//                *****
//                 ***
//                  *
