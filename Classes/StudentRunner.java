package ClassesQuestions;

public class StudentRunner {
	public static void main(String[] args) {
		/*
		
		Student student = new Student();
		student.setName("Amit");
		student.setEmail("amit@gmail.com");
		*/
		
		Employee employee = new Employee();
		employee.setName("Amit");
		employee.setEmail("amit@gmail.com");
		employee.setPhoneNumber("9786543212");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer");
		
		System.out.println(employee);
	}
}
