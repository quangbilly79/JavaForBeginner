package javacourse.section21collections;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueTest {
    public static void main(String[] args) {
        // Tg tự Set, Queue là Interface, cần tạo vs PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(0);
        queue.offer(2); // tg tự add, ok hơn add nếu dùng trong TH "capacity-restricted queue"
        queue.add(1);
        queue.add(3);
        queue.add(5);
        // Queue sẽ theo thứ tự add/offer, elem ms nhất ở cuối
        System.out.println(queue); // [0, 2, 1, 3, 5]
        // Lấy về elem đầu tiên (cũ nhất), đồng thời bỏ đi elem đó trong queue luôn
        System.out.println(queue.poll()); // 0
        System.out.println(queue); // [1, 2, 5, 3]
    }
}
