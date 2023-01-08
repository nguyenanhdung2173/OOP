package oop.homework6.time;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS =
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS =
            {"Sunday", "Monday", "Tuesday", "Wednesday",
                    "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS =
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] NON_LEAP_YEAR = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static final int[] LEAP_YEAR = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 0 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }

        int dayInMonth = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return 1 <= day && day <= dayInMonth;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return -1;
        }

        int century = 6 - 2 * ((year / 100) % 4);
        int twoLastDigitOfYear = year % 100;
        int twoDigitDivide = twoLastDigitOfYear / 4;
        int magicMonth = isLeapYear(year) ? LEAP_YEAR[month - 1] : NON_LEAP_YEAR[month - 1];

        return (century + twoLastDigitOfYear + twoDigitDivide + magicMonth + day) % 7;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        if (!isValidDate(year, month, day)) {
            return "invalid date!!!";
        }

        StringBuilder description = new StringBuilder();
        description.append(DAYS[getDayOfWeek(this.year, this.month, this.day)])
                .append(" ")
                .append(this.day)
                .append(" ")
                .append(MONTHS[this.month - 1])
                .append(" ")
                .append(this.year);
        return description.toString();
    }

    public MyDate nextDay() {
        this.day += 1;
        if (!isValidDate(year, month, day)) {
            this.month += 1;
            this.day = 1;
            if (!isValidDate(year, month, day)) {
                this.year += 1;
                this.month = 1;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        this.month += 1;
        int dayInMonth = DAYS_IN_MONTHS[month - 1] + (isLeapYear(year) && month == 2 ? 1 : 0);
        if (this.day > dayInMonth) {
            this.day = dayInMonth;
        }
        if (!isValidDate(year, month, day)) {
            this.year += 1;
            this.month = 1;
        }
        return this;
    }

    public MyDate nextYear() {
        this.year += 1;
        int daysInMonth = DAYS_IN_MONTHS[month - 1] + (isLeapYear(this.year) && month == 2 ? 1 : 0);
        if (this.day > daysInMonth) {
            this.day = daysInMonth;
        }
        return this;
    }

    public MyDate previousDay() {
        this.day -= 1;
        if (!isValidDate(year, month, day)) {
            this.month -= 1;
            if (this.month >= 1 && this.month <= 12) {
                this.day = DAYS_IN_MONTHS[month - 1] + (isLeapYear(this.year) && month == 2 ? 1 : 0);
            } else {
                this.month = 12;
                this.year -= 1;
                this.day = DAYS_IN_MONTHS[month - 1] + (isLeapYear(this.year) && month == 2 ? 1 : 0);
            }

        }
        return this;
    }

    public MyDate previousMonth() {
        this.month -= 1;
        int daysInMonth = DAYS_IN_MONTHS[month - 1] + (isLeapYear(this.year) && month == 2 ? 1 : 0);
        if (this.day > daysInMonth) {
            this.day = DAYS_IN_MONTHS[month - 1] + (isLeapYear(this.year) && month == 2 ? 1 : 0);
        }

        if (!isValidDate(year, month, day)) {
            this.year -= 1;
            this.month = 12;
            int daysInMonth1 = DAYS_IN_MONTHS[month - 1] + (isLeapYear(this.year) && month == 2 ? 1 : 0);
            if (this.day > daysInMonth) {
                this.day = daysInMonth;
            }
        }
        return this;
    }

    public MyDate previousYear() {
        this.year -= 1;
        int daysInMonth = DAYS_IN_MONTHS[month - 1] + (isLeapYear(this.year) && month == 2 ? 1 : 0);
        if (this.day > daysInMonth) {
            this.day = daysInMonth;
        }
        return this;
    }
}
