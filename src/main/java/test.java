public class test {

    public static void test(int a) {
        System.out.println("Abc");
    }
    public static int reverseNumber(int number) {
        if (number < 0) {
            return -1;
        }
        int length = 0;
        int reverseNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
            length += 1;
            System.out.printf("digit: %s, reverseNumber: %s, number: %s, length: %s",
                    digit, reverseNumber, number, length);
            System.out.println("----------------");
        }
        return reverseNumber;
    }

    public static void main (String[] args) {
        int x = 3;
        int y = 5;
        double z = x + y; // 8.0
        System.out.println(Math.sqrt(x));

        System.out.println(z);
        System.out.print("abcd");
        System.out.println("xyz");
        //test(z);

        System.out.println(3 == 3.0);
        System.out.println(reverseNumber(123456));
    }
}
