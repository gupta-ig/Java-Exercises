package ClassesQuestions;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address homeAddress = new Address("line 1", "Noida", "3003030");
		Customer person = new Customer("Amit", homeAddress);
		Address workAddress = new Address("line 1 for work", "Noida", "3003042");
		person.setWorkAddress(workAddress);
		System.out.println(person);
	}

}
