package ro.sda.iulian.Teme.ex4slack;

/**
 * Create a public enum Weekday with constants for MONDAY, TUESDAY,... until SUNDAY.The enum should have an instance method boolean isWeekDay() and an instance method boolean isHoliday().The isHoliday() method should return the opposite of isWeekDay().
 * 	Write a program which demonstrates how this enum could be used, which has a method which takes a Weekday as the argument and prints a message depending on whether the Weekday is a holiday or not.
 * 	We suggest that the main method loops over all values in the Weekday enum and sends them as argument to the method.
 */
public enum Weekday {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private boolean isWeekDay;
     Weekday(boolean isWeekDay)
     {
         this.isWeekDay=isWeekDay;
     }

    public boolean isWeekDay() {
    return isWeekDay;
    }
    public boolean isHoliday() {
         return !isWeekDay;
    }
}
