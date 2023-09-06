package javacourse.section18arrayarraylists;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayTest {

    public static void main(String[] args) {
        // Khởi tạo Array vs dataType[] variableName = {ele1, ele2,...}
        int[] marks = {1,2,4,5,6};
        System.out.println(marks.getClass()); // class [I
        System.out.println(marks); // [I@5679c6c6

        String[] arrayString = {"a", "b", "d"};
        System.out.println(marks.getClass()); // class [I

        // Hoặc có thể khởi tạo = cách tạo 1 Object với dataType[] variableName = new dataType[numOfElem]
        int[] arrayInt = new int[5];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]); // 0,0,0,0,0
        }
        System.out.println("-----------");
        // Truy vấn 1 ptử với array[i]
        System.out.println(arrayInt[2]); // 0
        // Có thể assign trực tiếp, array trong java là mutable
        arrayInt[2] = 1;
        System.out.println(arrayInt[2]); // 1
        // Check độ dài vs length (property, k phải method)
        System.out.println(arrayInt.length); // 5
        System.out.println("-----------");
        // 2 cách để loop 1 array trong Java
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
        for (String elem:arrayString) {
            System.out.println(elem);
        }

        // Có thể gán 1 Class Instance làm pt của array
        class Person {
            String name;
            public Person(String name) {
                this.name = name;
            }
            // ~ python __str__, để print trực tiếp instance
            public String toString() {
                return "[" + this.name + "]";
            }
        }
        Person[] arrayPerson = {new Person("a"), new Person("b")};
        for (Person person:arrayPerson) {
            System.out.println(person); // [a], [b]
        }
        // hoặc in nhanh vs Arrays.toString(arrayVar)
        System.out.println(Arrays.toString(arrayPerson)); // [[a], [b]]

        // 1 số hàm vs array sử dụng java.util.Arrays class
        int[] arrayInt1 = {2,1,4,3,5};
        int[] arrayInt2 = {2,1,4,3,5};
        // Compare 2 Array với Arrays.equals(array1, array2)
        System.out.println(arrayInt1 == arrayInt2); // false, k chuẩn vì là reference
        System.out.println(Arrays.equals(arrayInt1, arrayInt2)); // true

        // Sort Array với Arrays.sort(array) (asc và reverse)
        // asc
        Arrays.sort(arrayInt1);
        System.out.println(Arrays.toString(arrayInt1)); // [1, 2, 3, 4, 5]
        // reverse, dùng sort(array, Comparator), k thể dùng vs primitve data type mà phải dùng vs Integer
        Integer[] arrayInteger1 = {2,1,4,3,5};
        Arrays.sort(arrayInteger1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrayInteger1)); // [5, 4, 3, 2, 1]

        // Fill toàn bộ Array với Arrays.fill(value)
        int[] arrayIntBlank = {2,0,0,0,3};
        Arrays.fill(arrayIntBlank, 5);
        System.out.println(Arrays.toString(arrayIntBlank)); // [5, 5, 5, 5, 5]

    }
}
