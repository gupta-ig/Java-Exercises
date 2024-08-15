import java.util.Scanner;

public class OperationRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int x = sc.nextInt();
        System.out.print("Enter number2: ");
        int y = sc.nextInt();

        Add obj1 = new Add();
        System.out.println("Result of adding two numbers: " + obj1.perform(x, y));

        Subtract obj2 = new Subtract();
        System.out.println("Result of subtratcing two numbers: " + obj2.perform(x, y));

        Divide obj3 = new Divide();
        System.out.println("Result of dividing two numbers: " + obj3.perform(x, y));

        sc.close();
    }
}
