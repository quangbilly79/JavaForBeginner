package javacourse.section25functionalprogramming;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionalTest {
    // Viết thành 1 hàm tính tổng cho 1 list
    public int sumList(List<Integer> list1) {
        return list1.stream().reduce(0,
                // Hàm lambda có thể viêt đầy đủ tron {} vs return như bên dưới
                (elem1, elem2) -> {
                    System.out.printf("elem1: %s, elem2: %s", elem1, elem2);
                    return elem1 + elem2;
                }
                );
    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList,1,3,4,2,5);
        // convert thành stream để dùng các hàm như forEach, filter, map,... giống Scala
        // Lambda function elem -> funcx(elem). 1 vd về pass 1 hàm làm tham số
        integerList.stream().forEach(elem -> System.out.printf(elem + " "));
        System.out.printf("\n-----\n");
        // Tương tự có thể dùng filter để lọc trc, trả về 1 Stream
        integerList.stream()
                .filter(elem -> elem % 2 == 0)
                .forEach(elem -> System.out.printf(elem + " "));
        System.out.printf("\n-----\n");
        // Dùng reduce để tính toán kiểu "groupby". (~ foldLeft Scala)
        // Vd như tính tổng các số
        // Param 1 là identity, là giá trị khởi đầu
        // Param2 là binary operator, 1 hàm nhận 2 param và trả về 1 kq để reduce dần
        int resultInt = integerList.stream().reduce(0, (elem1, elem2) -> elem1 + elem2);
        System.out.println(resultInt); // 15=1+3+4+2+5
        int resultInt1 = integerList.stream().reduce(3, (elem1, elem2) -> elem1 - elem2);
        System.out.println(resultInt1); // -12=3-1-2-3-4-2-5

        // Tìm max min với method reference (::) với reduce(lambda) hoặc min/max(comparator)
        integerList.stream().reduce(Integer.MIN_VALUE, Integer::max);
        integerList.stream().reduce(Integer.MIN_VALUE, (elem1, elem2) -> Integer.max(elem1, elem2));

        integerList.stream().min(Integer::compareTo);





    }
}


