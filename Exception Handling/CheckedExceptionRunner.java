package exceptionalHandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	try {
			someOtherMethod();
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		someOtherMethod2();
	}
	
	private static void someOtherMethod2() throws RuntimeException {
		
	}

	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(1000);
	}

}
