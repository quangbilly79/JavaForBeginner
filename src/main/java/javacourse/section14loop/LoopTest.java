package javacourse.section14loop;

public class LoopTest {
    public static void main(String[] args) {
        // For loop
        // gồm 3 phần: Initialization, Condition, Update Operation
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // Update part cho xuống dưới cx đc
        for (int i = 0; i < 10; ) {
            System.out.println(i);
            i++;
        }
        // Update part cho xuống dưới cx đc
        for (int i = 100; i < 10;i++ ) {
            System.out.println(i);
        }

        // While loop
        // tương tự for loop, gồm 3 phần. Phần Init để ngoài, Update để trong
        int w = 0;
        while (w < 10) {
            System.out.println(w);
            w++;
        }
        System.out.println("-----");
        // Do While loop
        // Tương tự while loop, nhưng phần execute nằm trc phần điều kiện
        // Nên khác vs while loop, sẽ execute code tối thiểu 1 lần trc khi check đk
        int w1 = 10;
        do {
            System.out.println(w);
            w1++;
        } while (w1 < 10); // 10
    }
}
