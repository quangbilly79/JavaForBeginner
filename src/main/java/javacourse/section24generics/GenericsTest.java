package javacourse.section24generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    // Tạo 1 func mà param hay giá trị trả về chấp nhận nh type (cg 1 subclass),
    // tuy vậy method của param đó bị giới hạn ở Object
    // (vd list.size() sẽ k có dù list là List)
    static <X> X duplicate(X list) {
        System.out.println(list);
        return list;
    }

    // Tương tự như trên nhưng
    // Sử dụng Wildcard (?), cú pháp <? extends Class>
    // 2 method bên dưới là giống nhau
    static void duplicate1(List<? extends Number> list) {
        System.out.println(list);

    }
    static <X extends Number> void duplicate(List<X> list) {
        System.out.println(list);
    }

    // Tương tự như trên nhưng dùng super thay vì extends
    // Giờ mới thật sự là param chấp nhận mọi type
    static void duplicate2(List<? super Number> list) {
        list.add(1);
        list.add(1.1);
        list.add(1.2f);
    }

    public static void main(String[] args) {
        genericClassSimple<String> stringgenericClassSimple = new genericClassSimple<>();
        stringgenericClassSimple.addElement("abc");
        stringgenericClassSimple.addElement("xyz");
        stringgenericClassSimple.removeElement("abc");
        System.out.println(stringgenericClassSimple); // [xyz]
        System.out.println(stringgenericClassSimple.getElement(0)); // xyz


        genericClassSimple<Integer> integergenericClassSimple = new genericClassSimple<>();
        integergenericClassSimple.addElement(2);
        integergenericClassSimple.addElement(3);
        integergenericClassSimple.removeElement(3);
        System.out.println(integergenericClassSimple); // [2]
        System.out.println(integergenericClassSimple.getElement(0)); // x
        duplicate(integergenericClassSimple.arrayListT);

        genericClassExtends<Integer> test1 = new genericClassExtends<>();
        // Được nếu extends Integer, extends Number k đc
        // test1.arrayListT.get(0).compareTo();

        // Super thì chỉ tạo trực tiếp từ class cha
        List<Number> list1 = new ArrayList<>();
        duplicate2(list1);
        // Extends thì chỉ tạo đc từ Class con hoặc Class cha
        List<Integer> list2 = new ArrayList<>();
        duplicate1(list1);

    }

}
