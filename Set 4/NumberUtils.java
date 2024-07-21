//package Set4;

import java.util.Scanner;

public class NumberUtils {

    public int getLastDigit(int number) {
        // Write your code here
        if(number < 0) {
            return -1;
        }
        return number%10;
    }
    public static void main(String[] args) {
        NumberUtils obj = new NumberUtils();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Last digit of the number is: " + obj.getLastDigit(num));
        sc.close();
    }
}