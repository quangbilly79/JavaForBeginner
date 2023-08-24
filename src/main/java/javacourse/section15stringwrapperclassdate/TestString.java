package javacourse.section15stringwrapperclassdate;

public class TestString {
    public static void main(String[] args) {
        String str0 = "abcd";
        System.out.println(str0.indexOf(3)); // -1, return index theo special char (mã unicode)
        System.out.println(str0.indexOf('d')); // 3
        str0 = "cde";


    }
}
