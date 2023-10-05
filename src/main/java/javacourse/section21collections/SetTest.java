package javacourse.section21collections;
import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        // 2 cách tạo Seq
        // Vì Seq là 1 interface, nên phải tạo từ HashSet/Treeset
        // Có thể dùng Collections.addAll, hoặc tạo từ 1 Collection khác (List, ArrayList,..)
        Set<String> set1 = new HashSet<String>();
        Collections.addAll(set1, "a", "c", "e", "e");
        Set<String> set2 = new HashSet<String>(set1);

        // Không thể chứa ptử trùng
        System.out.println(set1); // [a, c, e]
        // Vị trí elem trong set k qtr,
        // nên k thể remove hay add theo position hay sort
        set1.add("e");
        System.out.println(set1); // [a, c, e]

        // Tạo các loại set từ arrayList, sẽ loại bỏ ptử trùng
        List<Integer> arrayListInt = new ArrayList<>();
        Collections.addAll(arrayListInt,3,1,5,3,4,4,1);
        Set<Integer> treeSetInt = new TreeSet<>(arrayListInt);
        Set<Integer> LinkedHashSetInt = new LinkedHashSet<>(arrayListInt);
        Set<Integer> HashSetInt = new HashSet<>(arrayListInt);
        System.out.println(treeSetInt); // [1, 3, 4, 5] ~ sort
        System.out.println(LinkedHashSetInt); // [3, 1, 5, 4] ~ theo thứ tự trong arrayList
        System.out.println(HashSetInt); // [1, 3, 4, 5] ~ k theo gì cả

    }
}
