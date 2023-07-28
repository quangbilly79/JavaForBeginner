package javacourse.section3OOP;

public class Main {
    public static void main (String[] args) {
        Motorbike honda = new Motorbike("honda", "gear1", 0);
        System.out.println(honda.getGear()); // gear1
        System.out.println(honda.getSpeed()); // 0
        honda.setGear("gear2");
        honda.setSpeed(3);
        System.out.println(honda.gear); // gear2
        System.out.println(honda.speed); // 3
        honda.speed=10;
        System.out.println(honda.getSpeed()); // 10
        honda.increaseSpeed(5);
        System.out.println(honda.getSpeed()); // 15

        Motorbike honda1 = new Motorbike("honda1");
        System.out.println(honda1.getGear()); // defaultGear

        // test default value trong TH k init giá trị
        Motorbike blank = new Motorbike();
        System.out.println(blank.speed); // 0
        System.out.println(blank.gear); // null

    }
}
