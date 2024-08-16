package ClassesQuestions;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(123, "OOPs with java", "Amit");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));
		
		System.out.println(book);
	}

}
