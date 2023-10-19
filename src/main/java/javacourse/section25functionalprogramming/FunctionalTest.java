package javacourse.section25functionalprogramming;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    // Return function trong 1 function
    public static Predicate<Integer> funcFuncPredicate() {
        return x -> x % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList,1,3,4,2,5,5,4);
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

        integerList.stream().min(Integer::compareTo).orElse(2);

        // original list: 1,3,4,2,5,5,4
        // sorted: trả về stream, có thể truyền vào Comparator
        integerList.stream().sorted().forEach(elem -> System.out.printf(elem + " "));
        // 1 2 3 4 4 5 5
        System.out.printf("\n-----\n");
        integerList.stream().sorted(Integer::compareTo).forEach(elem -> System.out.printf(elem + " "));
        System.out.printf("\n-----\n");

        // distinct: trả về stream chỉ chứa ptử distinct
        integerList.stream().distinct().forEach(elem -> System.out.printf(elem + " "));
        // 1 3 4 2 5
        System.out.printf("\n-----\n");

        // map: trả về stream sau khi áp func vs từng ptu
        integerList.stream().map(elem -> elem * elem).forEach(elem -> System.out.printf(elem + " "));
        // 1 9 16 4 25 25 16
        System.out.printf("\n-----\n");
        // Có thể kết hợp kiểu .sorted().distinct().map().foreach()

        // Convert sang List với .collect(Collectors.toList()/toSet()/toCollection())
        List<Integer> integerList1 = integerList.stream().collect(Collectors.toList());

        System.out.println(integerList1); // [1, 3, 4, 2, 5, 5, 4]
        // Convert sang Array với .toArray(Integer[]::new) (k có param sẽ trả về Object[])
        // Param đc gọi là generator, public interface IntFunction<R>
        Integer[] integerList2 = integerList.stream().toArray(Integer[]::new);
        System.out.println(integerList2); // [1, 3, 4, 2, 5, 5, 4]


        // in mũ 2 của 10 số từ 1 đến 10
        // Dùng IntSream.range(i1,i2) để tạo 1 stream bđ vs i1 va kết thúc vs i2-1
        IntStream.range(1,10).forEach(elem -> System.out.printf(elem*elem + " "));
        System.out.printf("\n-----\n");
        // in lower case của tất cả ký tự
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "aB", "BB", "ac", "Ca");
        stringList.stream().forEach(elem -> System.out.printf(elem.toLowerCase() + " "));
        System.out.printf("\n-----\n");
        // in do. dai` cac' tu`
        stringList.stream().forEach(elem -> System.out.printf(elem.length() + " "));

        // Gán function cho 1 biến
        Predicate<Integer> funcValPredicate = x -> x % 2 == 0;
        Consumer<String> funcValConsumer = System.out::printf;
        System.out.printf("\n-----\n");
        integerList.stream().filter(funcValPredicate).forEach(System.out::println);
        System.out.printf("\n-----\n");


        integerList.stream().filter(funcFuncPredicate()).forEach(System.out::println);



    }
}


