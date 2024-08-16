package CollectionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(1, "Amit"), new Student(100, "Aman"), new Student(2, "Eve"));
		ArrayList<Student> studentsAl = new ArrayList<>(students);
		
		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println("Desc " + studentsAl);
		//Collections.sort(studentsAl, new AscendingStudentComparator());
		
		studentsAl.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator " + studentsAl);
	}

}
