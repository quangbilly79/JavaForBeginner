package javacourse.section21collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {
    public static void main(String[] args) {
        // Lỗi do List là 1 interface
        // List<String> stringList1 = new List<String>();

        // Đc vì ArrayList implement interface List
        // List<String> stringList1 = new ArrayList<>();

        // List.of chỉ dùng đc vs java 9
        // List<String> stringList1 = List.of("a", "b");

        // Java 8 sẽ phải tạo thông qua ArrayList
        // Có thể dùng addAll
        List<String> stringList1 = new ArrayList<String>();
        Collections.addAll(stringList1, "a", "b", "c");
        // Hoặc tạo từ 1 Collection khác
        List<String> stringList3 = new ArrayList<String>(stringList1);
        // Các method khá tg tự array list
        System.out.println(stringList1.size()); //(thay vì length)
        stringList1.add(0,"d");
        stringList1.set(3, "e");
        System.out.println(stringList1); // d,a,b,e
        System.out.println(stringList1.get(3)); // e
        System.out.println(stringList1.indexOf("e")); // 3
        System.out.println(stringList1.contains("e")); // true

        List<String> stringList4 = new LinkedList<String>();
        List<String> stringList2 = new Vector<String>(stringList1);

        // List hay Array list đều có thể chứa nh kdl (k như array)
        List arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1,2,"a",true);
        System.out.println(arrayList.toString());
    }
}
