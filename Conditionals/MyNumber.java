package conditionals;

public class MyNumber {
	int num;
	MyNumber(int num) {
		this.num = num;
	}
	public boolean isPrime() {
		if(num < 2) {
			return false;
		}
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);
		int sumOfNumber = number.sumUptoN();
		System.out.println(sumOfNumber);
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println(sumOfDivisors);
		number.printANumberTriangle();
	}
	private void printANumberTriangle() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	private int sumOfDivisors() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	private int sumUptoN() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	
}
