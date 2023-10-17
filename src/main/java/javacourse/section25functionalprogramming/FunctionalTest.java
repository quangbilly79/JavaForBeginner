package javacourse.section25functionalprogramming;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionalTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList,1,3,4,2,5);
        // convert thành stream để dùng các hàm như forEach, filter, map,... giống Scala
        // Lambda function elem -> funcx(elem). 1 vd về pass 1 hàm làm tham số
        integerList.stream().forEach(elem -> System.out.printf(elem + " "));
    }
}
