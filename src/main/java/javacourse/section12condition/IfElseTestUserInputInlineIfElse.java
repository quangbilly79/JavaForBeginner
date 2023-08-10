package javacourse.section12condition;

import java.util.Scanner;

public class IfElseTestUserInputInlineIfElse {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of number i");

        // Sử dụng while + try/catch để kiểm tra input đầu vào
        int i = 0;
        while (true) {
            try {
                // Dùng method nextInt (nếu input là int) hoặc nextLine (String) hoặc ...
                // Mỗi lần gọi method sẽ là 1 lần xg dòng và nhập input
                i = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please input a number");
                // Cần gọi method nextLine để ăn input String bên trên
                // (chưa đc gán vào biến i do k hợp lệ)
                scanner.nextLine();
            }
        }


        // cú pháp if, else if, nested if-else
        if (i < 25) {
            if (i > 20) {
                System.out.println(String.format("%d < 25 && %d > 20", i, i));
            } else {
                System.out.println(String.format("%d < 25 && %d < 20", i, i));
            }
        } else if (i < 30) {
            System.out.printf("%d < 30\n", i);
        } else {
            System.out.println(String.format("%d > 30", i));
        }

        // switch: Khá tương tự if else
        switch (i) {
            // Chỉ dùng đc vs 1 giá trị (vd <x k đc)
            case 25:
                System.out.println(String.format("%d < 25 && %d > 20", i, i));
                // Cần break, nếu k sẽ chạy hết phần bên dưới
                break;
            // Nh case cùng trả về 1 kq
            case 26:
            case 27:
            case 28:
            case 29:
                System.out.printf("%d < 30\n", i);
                break;
            // default case ~ else
            default:
                System.out.println(String.format("%d > 30", i));
                break;
        }
        // Ternary (inline if else)
        // Cú pháp (condition ? valueIfTrue : valueIfFalse)
        String ternary1 = (i % 2 == 0 ? "a" : "b");
        boolean ternary2 = (i % 2 == 0 ? true : false);
    }
}
