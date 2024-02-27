// Task_5

// Design and implement a class called Card that represents a standard playing card. 
// Each card has a suit and a face value. Create a program that deals five random cards.


import java.util.Random;
import java.util.*;

public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  	    String[] face = {" 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K", " A" };
		String[] suit = {"\u2665", "\u2666", "\u2660", "\u2663"};
		
		Random faces = new Random();
		Set<String> randomCards = new HashSet<>();
		
		while (randomCards.size() < 5) {
			int randomFace = faces.nextInt(face.length);
			int randomSuit = faces.nextInt(suit.length);
			String pack = "|           |\n| " + suit[randomSuit] + "       " + suit[randomSuit] + " |\n|           |\n|           |\n|    " 
			+ face[randomFace] 	+ "\t    |" + "\n|           |\n" +"|           |\n" +  "| " + suit[randomSuit] 
					+ "       " + suit[randomSuit] + " |\n|___________|\n";
			randomCards.add(pack);
		
		}

		for (String card : randomCards) {
			if (card.contains("\u2665") || card.contains("\u2666")) {
				System.err.print(" ___________ \n"+card + "");
				
			}else { 
				System.out.print(" ___________ \n" + card + "");
			}
		}

	}

}


// Output:

//  ___________ 
// |           |
// | ♥       ♥ |
// |           |
// |           |
// |     8	   |
// |           |
// |           |
// | ♥       ♥ |
// |___________|
//  ___________ 
// |           |
// | ♣       ♣ |
// |           |
// |           |
// |     3	   |
// |           |
// |           |
// | ♣       ♣ |
// |___________|
//  ___________ 
// |           |
// | ♦       ♦ |
// |           |
// |           |
// |     9     |
// |           |
// |           |
// | ♦       ♦ |
// |___________|
//  ___________ 
// |           |
// | ♥       ♥ |
// |           |
// |           |
// |     K	   |
// |           |
// |           |
// | ♥       ♥ |
// |___________|
//  ___________ 
// |           |
// | ♥       ♥ |
// |           |
// |           |
// |     5	   |
// |           |
// |           |
// | ♥       ♥ |
// |___________|
