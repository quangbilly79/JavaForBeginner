package javacourse.section2basicexercise;
//A year is a leap year in the Gregorian calendar if:
//
//        It is divisible by 4 (AND)
//
//        It is NOT divisible by 100 (except when it is divisible by 400)
//
//        Not Divisible by 4 - NOT Leap Year (2041)
//
//        Divisible by 4 and NOT divisible by 100 - Leap Year (2048)
//
//        Divisible by 4 and divisible by 100 - Additional check needed
//
//        Divisible by 4, divisible by 100, divisible by 400 - Leap Year (2000, 2400)
//
//        Divisible by 4, divisible by 100, NOT divisible by 400 - NOT Leap Year (2100, 2200, 2300)

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        // Check theo đk truye
        if (year%4==0 && year>0) {
            if (year%100!=0) {
                return true;
            }
            else {
                if (year%400==0) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String[] arge) {
        System.out.println(isLeapYear(1900)); // f
        System.out.println(isLeapYear(2000)); // t
        System.out.println(isLeapYear(2001)); // f
        System.out.println(isLeapYear(2004)); // t
        System.out.println(isLeapYear(2400)); // t

    }
}


