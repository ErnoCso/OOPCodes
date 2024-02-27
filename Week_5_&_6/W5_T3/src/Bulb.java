
public class Bulb {

	private boolean isOn; 
	private String bulbName;
	
	public Bulb(String bulbName) {
		this.isOn = false;
		this.bulbName = bulbName;
	}
	
	public void turnOn() {
		isOn = true;
		System.out.println(bulbName + " is now on.");
	}
	
	public void turnOff() {
		isOn = false;
		System.out.println(bulbName + " is now off.");
	}
	
	public boolean isOn() {
		return isOn;
	}

}
