package ro.sda.iulian.Teme.ex4slack;

public class Main {
    public static void main(String[] args) {
        Weekday[] weekdays = Weekday.values();
        for (Weekday weekday : weekdays) {
            System.out.println(weekday.name());
            System.out.println(weekday.isWeekDay());
        }
    }
}