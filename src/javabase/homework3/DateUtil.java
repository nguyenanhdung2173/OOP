package javabase.homework3;

public class DateUtil {
    public static String[] strMonths = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    public static int[] daysInMonths
            = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    public static int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (!((year >= 1 && year <= 9999) && (month >= 1 && month <= 12))) return false;

        int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);

        return 1 <= day && day <= monthDays;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int centuryNumber = 6 - 2 * ((year / 100) * 4);
        int lastTwoDigitOfYear = year % 100;
        int magicYearNumber = lastTwoDigitOfYear / 4;
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];

        return (centuryNumber + lastTwoDigitOfYear + magicYearNumber + magicMonthNumber + day) % 7;
    }

    public static String printDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) return "not a valid date!";
        int d = getDayOfWeek(year, month, day);
        return strDays[d] + " " + day + " " + strMonths[month - 1] + " " + year;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(isValidDate(2000, 1, 1));

        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(printDate(2000, 1, 1));
    }
}
