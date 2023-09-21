package javacourse.section21collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return String.format("Name: %s. Age: %s", name, age);
    }
}


public class Sort {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Collections.addAll(studentList, new Student("a", 1), new Student("c", 0),
                new Student("b", 3));
        System.out.println(studentList); // [bbb, c, d, a, z, ll]
        //Collections.sort(studentList);
        System.out.println(studentList); // [a, bbb, c, d, ll, z]
    }
}
