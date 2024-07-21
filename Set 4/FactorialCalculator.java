import java.util.Scanner;

public class FactorialCalculator {

    public int calculateFactorial(int number) {
        // Write your code here
        int product = 1;
        if(number < 0) {
            return -1;
        }
        for(int i = 1; i <= number; i++) {
            product *= i;
        }
        
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        FactorialCalculator obj = new FactorialCalculator();
        int result = obj.calculateFactorial(num);
        System.out.println("Fatorial of the number is: " + result);
        sc.close();
    }
}