package ch8;

// Ex-8.7
public class Time4 {

    private int hour, minute, second;

    // Constructor with default values
    public Time4() {
        this(0, 0, 0);
    }

    // Constructor with parameters
    public Time4(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid time values");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Increment the time by one second
    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            incrementMinute();
        }
    }

    // Increment the minute by one
    public void incrementMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            incrementHour();
        }
    }

    // Increment the hour by one
    public void incrementHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
        }
    }

    // Convert time to a string in HH:MM:SS format
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static void main(String[] args) {
        Time4 time = new Time4(23, 59, 58); // 11:59:58 PM

        System.out.println("Initial time: " + time);
        time.tick();
        System.out.println("After one second: " + time);
        time.tick();
        System.out.println("After another second: " + time);

        Time4 time2 = new Time4(1, 59, 59); // 1:59:59 AM
        System.out.println("\nInitial time: " + time2);
        time2.tick();
        System.out.println("After one second: " + time2);

        Time4 time3 = new Time4(12, 0, 0); // 12:00:00 PM
        System.out.println("\nInitial time: " + time3);
        time3.incrementHour();
        System.out.println("After incrementing hour: " + time3);
    }
}