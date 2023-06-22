package javacourse.section1jshelltest;

public class ForWhileIfCondition {
    // main method
    public static void main(String[] args) {
        // Test if else
        int k = 2;
        if (k>3) {
            System.out.println("k is greater than 3");
        } else if (k == 3) {
            System.out.println("k is equal to 3");
        } else {
            System.out.println("k is less than 3");
        }
        // Test for loop
        // Cú pháp: for(khởi tạo giá trị; điều kiện; update giá trị;) {câu lệnh;}
        for(int i = 1; i<=10; i++){
            System.out.printf("Phep nhan voi %d\n", i);
            for(int j = 1; j<=10; j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }

        // Test while loop
        // Cú pháp: khởi tạo giá trị; while(điều kiện) {câu lệnh; update giá trị;}
        int i = 1;
        while (i<=10) {
            int j = 1;
            System.out.printf("Phep nhan voi %d\n", i);
            while(j<=10) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
                j++;
            }
            i++;
        }
        System.out.println(i);
        // In các số lẻ mũ 2
        for(i = 1; i<=10; i++) {
            if (i % 2 != 0) {
                System.out.printf("Square root of odd number %d: %f\n", i, Math.pow(i, 2));
            }
        }

        for(int d = 0, e = 5; d<=10 && e<=14; d++, e++) {
            System.out.printf("%d, %d\n",d,e);
        }

    }
}
