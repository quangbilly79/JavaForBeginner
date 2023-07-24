package javacourse.section2BasicExercise;

// tính tổng bình phuơng các số từ 1 đến n. Vd n = 3 => 1^2+2^2+3^2
public class SumOfSquares {
    public static long calculateSumOfSquares(int n) {
        if (n < 0) {
            return -1;
        }
        long sum = 0;
        for (int i = 0; i<=n; i++) {
            sum+= (long) i *i;
            // Can` them long dang. (long) i *i
            // phép nhân i*i cần thưc hiện dưới dạng nhân long, cần 1 ptử là long, giống 3.0/2
        }
        return sum;
    }
    public static void main (String[] arge) {
        System.out.println(calculateSumOfSquares(100000000));
        //672921401752298880 with long i*i
        //20049330185600 with just i*i

        int j = 999999999;
        long k = j*1000L; // hoặc (long) j * 1000;
        System.out.println(k);

    }
}