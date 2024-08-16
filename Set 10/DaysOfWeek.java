enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String name;

    DaysOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        // Write your code here to return the name of the day
        return name;
    }

    public boolean isWeekday() {
        // Write your code here to check if this day is a weekday
        if(this == MONDAY || this == TUESDAY || this == WEDNESDAY || this == THURSDAY || this == FRIDAY) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isHoliday() {
        // Write your code here to check if this day is a holiday
        if(!isWeekday()) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.FRIDAY;

        System.out.println(day.isHoliday());
        System.out.println(day.isWeekday());
    }
}