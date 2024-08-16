package ClassesQuestions;

import java.math.BigDecimal;

public class Employee extends Person{
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	private String title;
	private String employeeName;
	private char employeeGrade;
	private BigDecimal salary;
	
	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return super.toString() + "#" + title + "#" + employeeName + "#" + employeeGrade;
	}
}
