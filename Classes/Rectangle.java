package ClassesQuestions;

public class Rectangle {
	private int length;
	private int breadth;
	
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	public int area() {
		return length*breadth;
	}
	
	public int perimeter() {
		return 2*(length + breadth);
	}
	
	public String toString() {
		return String.format("length - %d, breadth - %d, area - %d, perimeter - %d", length, breadth, area(), perimeter());
	}
}
