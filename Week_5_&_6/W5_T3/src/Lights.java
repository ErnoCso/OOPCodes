// Task_3

// Bulb

// Design and implement a class called Bulb that represents 
// a light bulb that can be turned on and off.
// Create a driver class called Lights, whose main method 
// instantiates and turns on some Bulb objects

public class Lights {

	public static void main(String[] args) {
		
		
		Bulb bulb1 = new Bulb("\nBulb 1");
		Bulb bulb2 = new Bulb("Bulb 2");
		
		bulb1.turnOn();
		bulb2.turnOn();
		
		System.out.println(bulb1.isOn()? "\nBulb 1 is on." : "Bulb 1 is off.");
		System.out.println(bulb2.isOn()? "Bulb 2 is on." : "Bulb 2 is off.");
		
		bulb1.turnOff();
	
		System.out.println(bulb1.isOn() ?"\nBulb 1 is on." : "Bulb 1 is off.");
		System.out.println(bulb2.isOn() ?"Bulb 2 is on." : "Bulb 2 is off.");
		

	}
	
}

// Output:

// Bulb 1 is now on.
// Bulb 2 is now on.
//
// Bulb 1 is on.
// Bulb 2 is on.
//
// Bulb 1 is now off.
// Bulb 1 is off.
// Bulb 2 is on.
