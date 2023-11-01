package javacourse.section27threadconcurrency;

public class ThreadTest {
    // Có 2 cách để tạo 1 thread, 1 là extends Thread, 2 là implements Runnable
    // Hiện dùng cách 1 trc
    static class Task1 extends Thread {
        // Cần override run method. Nội dung chạy của thread nằm trong method này
        public void run() {
            System.out.println("Task 1 start");
            for(int i = 0; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println("Task 1 done");
        }
    }

    // Cách 2 dùng implements Runnable, bên trong tương tự
    static class Task2 implements Runnable {
        // Cần override run method. Nội dung chạy của thread nằm trong method này
        public void run() {
            System.out.println("Task 2 start");
            for(int i = 0; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println("Task 2 done");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        // Khởi tạo Instance thread tg ứng
        // Chạy với .start() thay vì .run() để chạy song song
        // Output kết quả sẽ k theo thứ tự từ trên xuống mà sẽ ngẫu nhiên,
        // vd như bên dứoi code chạy Task1 lại in ở cuối cùng thay vì đầu tiên
        Task1 threadTask1 = new Task1();
        threadTask1.setPriority(4);
        threadTask1.start();

        // Dừng code 1 khoảng thời gian
        Thread.sleep(1000);

        // Dùng runnable thì phải tạo 1 instance runable, xong tạo 1 thread từ instance đó
        // Tg tự chạy với .start(), thứ tự execute ngẫu nhiên
        Task2 runableTask2 = new Task2();
        Thread threadTask2 = new Thread(runableTask2);
        // Set priority với .setPriority(1 -> 10)
        // Càng cao càng ưu tiên, mặc định 5
        // Tuy vậy execution order vẫn khá ngẫu nhiên, k guarantee
        threadTask2.setPriority(10);
        threadTask2.start();

        // Đảm bảo 1 thread chạy xong ms chạy đoạn code sau  đóvới threadx.join() (gurantee)
        threadTask1.join();


        System.out.println("Task 3 start");
        for(int i = 21; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Task 3 done");

    }
}
