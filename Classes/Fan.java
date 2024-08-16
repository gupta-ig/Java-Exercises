package ClassesQuestions;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed; // 0 to 5
	
	Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius; 
		this.color = color;
	}
	public void isOn() {
		this.isOn = isOn;
	}
	
	public void switchOn() {
		this.isOn = true;
		changeSpeed((byte)5);
	}
	public void switchOff() {
		this.isOn = false;
		changeSpeed((byte)0);
	}
	public void changeSpeed(byte speed) {
		this.speed = speed;
	}
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn, speed);
	}

	public void isOn(boolean b) {
		// TODO Auto-generated method stub

	}
	

}
