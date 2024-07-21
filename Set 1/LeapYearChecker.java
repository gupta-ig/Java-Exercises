public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if(year == 0)
        {
            return false;
        }
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            return true;
        }
       return false;
    }
    public static void main(String[] args) {
        boolean lp = LeapYearChecker.isLeapYear(2004);
        if(lp) {
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is a not leap year");
        }
    }
}