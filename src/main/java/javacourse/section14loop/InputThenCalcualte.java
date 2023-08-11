package javacourse.section14loop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputThenCalcualte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please type a number");
                int i = scanner.nextInt();
                if (i < 0) {
                    System.out.println("Encounter negative number. End program");
                    break;
                } else {
                    System.out.printf("Square of %d is %d \n", i, i*i);
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a number");
                scanner.nextLine();
            }
        }

    }
}
