package javacourse.section11PrimativeDataType;

public class BiNumberExercise {
    public static class BiNumber {
        private int num1;
        private int num2;
        BiNumber(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
        public int getNum1() {
            return num1;
        }

        public int getNum2() {
            return num2;
        }
        public int add() {
            return num1 + num2;
        }
        public int multiply() {
            return num1 * num2;
        }
        public void doubleNum() {
            num1 *= 2;
            num2 *= 2;
        }
    }
    public static void main(String[] args) {
        BiNumber biNumber = new BiNumber(3, 4);
        System.out.println(biNumber.add()); // 7
        System.out.println(biNumber.multiply()); // 12
        biNumber.doubleNum();
        System.out.println(biNumber.getNum1()); // 6
        System.out.println(biNumber.getNum2()); // 8

    }
}
