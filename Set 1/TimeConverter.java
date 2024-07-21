public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        if(hours < 0)
        {
            return -1;
        }
        int minutes = hours * 60;
        return minutes;
    }
    
    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        if(days < 0)
        {
            return -1;
        }
        int hrs = days * 24;
        return convertHoursToMinutes(hrs);
    }
    public static void main(String[] args) {
        int hrsToMin = TimeConverter.convertHoursToMinutes(15);
        int daysToMin = TimeConverter.convertDaysToMinutes(15);

        System.out.println("Days To Minutes is: " + daysToMin);
        System.out.println("Hours to minutes is: " + hrsToMin);
    }
}
