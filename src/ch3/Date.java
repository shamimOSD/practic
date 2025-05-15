package ch3;
//Create a Date class and display dates in month/day/year format.
public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    public int getMonth() {
        return month;
    }
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public static void main(String[] args) {
        Date today = new Date(4, 28, 2025);

        System.out.print("Today's date is: ");
        today.displayDate();
    }
}

