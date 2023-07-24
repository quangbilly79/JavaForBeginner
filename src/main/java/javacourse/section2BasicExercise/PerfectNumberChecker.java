package javacourse.section2BasicExercise;

//In this exercise, your task is to implement a method in the PerfectNumberChecker class
// that checks whether a number is a "perfect number".
//
//        A Perfect Number is a positive integer that is equal to the sum of all of its positive divisors,
//        excluding itself.
//
//        For example, the number 6 is a perfect number because its divisors are 1, 2, and 3.
//        The sum of these divisors is equal to 6, so 6 is a perfect number.
//        Similarly, 28 is also a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.

public class PerfectNumberChecker {
    public static boolean isPerfectNumber(int number) {
        if (number <=0) {
            return false;
        }
        // check từ 1 đến sqrt(n), xem n chia hết cho số nào
        // thì + vào tổng sum, cho đến khi sum = n
        int sum = 0;
        for (int i = 1; i*i<=number; i++) {
            if (number%i==0) {
                sum += i;
            }
        }
        return sum == number;
    }
    public static void main (String[] args) {
        System.out.println(isPerfectNumber(6)); // f
        System.out.println(isPerfectNumber(28)); // t
        System.out.println(isPerfectNumber(27)); // f
        System.out.println(isPerfectNumber(100)); // t
    }
}