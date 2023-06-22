package javacourse.section1jshelltest;

class VariableType2 {
    static int myStaticVariable = 10; // Static var


    int myInstanceVariable = 11; // Non Static (Instance var)
    public static void main(String[] args) {
        int myLocalVariable = 12;
        System.out.println(myLocalVariable);

        System.out.println(myStaticVariable); // Dùng trong cg 1 class có thể gọi trực tiếp

        // System.out.println(myInstanceVariable); // Lỗi
        VariableType2 myClassInstance = new VariableType2(); // Tạo Instance
        System.out.println(myClassInstance.myInstanceVariable); // Phải gọi qua Instance

    }
}

public class VariableType1 {
    public static void main(String[] args) {
        System.out.println(VariableType2.myStaticVariable); // Khác class phải gọi MyClass class
        VariableType2.myStaticVariable = 20; // Modifying the value of static variable
        System.out.println(VariableType2.myStaticVariable); // Accessing modified value
    }
}
