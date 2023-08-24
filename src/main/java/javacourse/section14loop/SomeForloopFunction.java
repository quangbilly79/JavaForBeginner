package javacourse.section14loop;

public class SomeForloopFunction {
    // check xem 1 số có phải prime number k
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // tính tổng các divisor
    public static long sumDivisor(int n) {
        long sum = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i != Math.sqrt(n)) {
                    sum += i;
                    sum += n / i;
                } else {
                    sum += i;
                }
            }
        }
        return sum;
    }
    // In kim tự tháp số
    public static void printNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }

    }

    // In các số mà mũ 2 nhỏ hơn 1 số
    public static void printSquareRoot(int n) {
        int i = 1;
        while (i <= Math.sqrt(n)) {
            System.out.print(i*i + " ");
            i++;
        }
        System.out.println();
    }

    // In các số mà sau khi mũ 3 lên vẫn nhỏ hơn n
    public static void printCube(int n) {
        int i = 1;
        while (i <= Math.pow(n,(float)1/3)) {
            System.out.print(i*i*i + " ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(isPrime(23));
        System.out.println(sumDivisor(6));
        printNumberTriangle(6);
        printSquareRoot(30);
        printCube(30);
    }
}
