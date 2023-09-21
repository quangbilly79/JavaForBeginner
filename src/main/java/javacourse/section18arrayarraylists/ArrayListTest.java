package javacourse.section18arrayarraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        // Tạo array list chấp nhận mọi type, cần add elem thủ công
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add("a");
        arrayList1.add(false);

        // Tạo array list chỉ chấp nhận 1 loại data type, cần add elem thủ công
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("b");
        arrayList2.add("a");
        arrayList2.add("d");
        System.out.println(arrayList2.toString());

        // Có thể remove theo index hoặc object
        arrayList1.remove("a"); // object
        arrayList1.remove(1); // index
        arrayList1.remove(Integer.valueOf(1)); // object
        System.out.println(arrayList1.toString()); // [1, a, false] => [0]
        // Update và truy vấn 1 ptử vs set và get
        arrayList1.add("e");
        arrayList1.set(0, 3);
        System.out.println(arrayList1.get(0)); // 3
        arrayList1.add(0,1);
        System.out.println(arrayList1); // 1 3

        // 1 số method khác sử dụng Collections method
        System.out.println(Collections.max(arrayList1)); // max elem

        // Tạo nhanh array list vs nh ptử
        ArrayList arrayList3 = new ArrayList();
        Collections.addAll(arrayList3, 3,4,5,6,"c");
        System.out.println(arrayList3.toString()); // [3, 4, 5, 6, c]

        // arraylist phải initialized (=...),
        // k thể khai báo mặc định như int, string,...
        ArrayList arrayListNul;
        //System.out.println(arrayListNul);

        // Sử dụng iterator thay for loop (array k đc)
        Iterator arrayList3Iterator = arrayList3.iterator();
        while (arrayList3Iterator.hasNext()) {
            System.out.println(arrayList3Iterator.next());
        }

    }
}
