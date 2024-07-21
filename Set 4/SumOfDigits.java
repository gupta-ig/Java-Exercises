import java.util.Scanner;

public class SumOfDigits {

    public int getSumOfDigits(int number) {
        // Write your code here
        int sumOfDigits = 0;
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 0;
        }
        while(number > 0) {
            sumOfDigits += number%10;
            number /= 10;
        }
        return sumOfDigits;
    }
    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = obj.getSumOfDigits(num);
        System.out.printf("Sum of digits of %d is %d", num, result).println();
        sc.close();
    }
}