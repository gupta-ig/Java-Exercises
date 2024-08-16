package ClassesQuestions;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Manufacturer 1", 0.3456, "Green");
		fan.switchOn();
		System.out.println(fan);
		fan.changeSpeed((byte)3);
		fan.switchOff();
		System.out.println(fan);
	}

}
