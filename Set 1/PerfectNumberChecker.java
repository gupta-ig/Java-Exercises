public class PerfectNumberChecker {
    public static boolean isPerfectNumber(int number) {
        if(number <= 0)
        {
            return false;
        }
        
        int sumOfDivisors = 0;
        for(int i = 1; i < number; i++)
        {
            if(number % i == 0)
            {
                sumOfDivisors += i;
            }
        }
        return (sumOfDivisors == number);
    }
    public static void main(String[] args) {
        boolean num = PerfectNumberChecker.isPerfectNumber(20);
        if(num) {
            System.out.println("The number is perfect");
        }
        else {
            System.out.println("The number is not perfect");
        }
    }
}