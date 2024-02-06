
// Task_1
//
// Write a Java program that prints a table with a list of at least 5 students
// together with their grades earned (lab points, bonus points, and the total) in the format below.



public class tableOfStudentGrades {

	public static void main(String[] args) {
		
		String x = "///////////////////";
		String x2 = "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";
		String[] names = {"Ryan", "Maurice","William","Joshua","Muhamed"};
		int[] labs = {48,50,39,49,50};
		int[] bonuses = {7,8,10,9,10};
		int[] LabsAndBonuses = new int[labs.length];

		System.out.println(x+x2);
		System.out.println("==          Student Points          ==");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
		System.out.println("Name\t\tLab\tBonus\tTotal");
		System.out.println("----\t\t---\t-----\t-----");
		
		for (int i= 0; i < names.length; i++) {

			LabsAndBonuses[i] = labs[i] + bonuses[i];
			System.out.println(names[i] + "\t\t" + labs[i]+"\t " + bonuses[i]+ "\t " + LabsAndBonuses[i]);
			
		}
		
	}

}


// Output:
// 
// ///////////////////\\\\\\\\\\\\\\\\\\\
// ==          Student Points          ==
// \\\\\\\\\\\\\\\\\\\///////////////////
// Name		Lab	Bonus	Total
// ----		---	-----	-----
// Ryan	    	48	7	55
// Maurice		50	8	58
// William		39	10	49
// Joshua		49	9	58
// Muhamed		50	10	60