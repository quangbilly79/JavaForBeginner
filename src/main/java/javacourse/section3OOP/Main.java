package javacourse.section3OOP;

public class Main {
    public static void main (String[] args) {
        Motorbike honda = new Motorbike("honda", "gear1", 0);
        System.out.println(honda.gear); // gear1
        System.out.println(honda.speed); // 0
        honda.adjustGear("gear2");
        honda.adjustSpeed(3);
        System.out.println(honda.gear); // gear2
        System.out.println(honda.speed); // 3
        honda.speed=10;
        System.out.println(honda.speed); // 10

    }
}
