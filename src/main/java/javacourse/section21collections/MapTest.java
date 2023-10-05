package javacourse.section21collections;
import java.util.HashMap;
import java.util.Map;
public class MapTest {
    public static void main(String[] args) {
        // Khởi tạo Map, dùng HashMap class implement Map itf
        // Hiện k có cách nào insert nh k-v 1 lúc (trừ khi dùng vòng lặp)
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("k1", 1);
        map1.put("k2", 2);
        map1.put("k3", 0);
        System.out.println(map1); // {k1=1, k2=2, k3=0}
        System.out.println(map1.get("k1")); // 1 ~ get value theo key, null nếu k có
        System.out.println(map1.getOrDefault("k4", 99)); // tg tự get, nếu k có sẽ trả về giá trị mặc định
        System.out.println(map1.size()); // 3
        System.out.println(map1.isEmpty()); // false
        System.out.println(map1.containsKey("k1")); // true
        System.out.println(map1.containsValue(4)); // false
        System.out.println(map1.keySet()); // [k1, k2, k3] ~ trả về set các key
        System.out.println(map1.values()); // [1, 2, 0] ~ trả về Collection các val
        System.out.println(map1.remove("k1")); // 1 ~ trả về value của key mà remove, đồng thời remove key đó khỏi map
        System.out.println(map1); // {k2=2, k3=0}


    }
}
