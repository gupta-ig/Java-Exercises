public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
       // write your code here
       if(n < 0)
       {
           return -1;
       }
       if(n == 0)
       {
           return 0;
       }
       int sum = 0;
       for(int i = 1; i <= n; i++)
       {
           sum += i*i;
       }
       return sum;
    }
    public static void main(String[] args) {
        SumOfSquares sum = new SumOfSquares();
        System.out.println("Sum of Squares is: " + sum.calculateSumOfSquares(10));
    }
}