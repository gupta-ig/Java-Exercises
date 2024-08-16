package ArrayQuestions;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student("Ranga", 97, 98, 100);
		
		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinMark();
		System.out.println("Number: " + number);
		System.out.println("sum: " + sum);
		System.out.println("maximumMark" + maximumMark);
		System.out.println("minimumMark: " + minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("BigDecimal: " + average);
		
		System.out.println(student);
		
		student.addNewMark(35);
		System.out.println(student);
		
		student.removeMarkAtIndex(1);
		System.out.println(student);
	}

}
