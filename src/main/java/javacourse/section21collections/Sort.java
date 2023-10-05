package javacourse.section21collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Implement interface Comparable<Type>, Type ở đây là Class cần compare
// phải override method compareTo luôn (method duy nhất trong Comparable Interface)
class Student implements Comparable<Student>{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return String.format("Name: %s. Age: %s", name, age);
    }

    @Override
    public int compareTo(Student that) {
        // Sort theo age
        // Cần return -1, 0, 1 tg ứng với nhỏ, bằng, lớn (thông thường)
        /*
        if (this.age < that.age) {
            return -1;  // this is less than that
        } else if (this.age == that.age) {
            return 0;   // this is equal to that
        } else {
            return 1;   // this is greater than that
        }*/
        // Hoặc các method có sẵn (Integer.compare, str1.compareTo)
        return Integer.compare(this.age, that.age);

    }
}


public class Sort {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Collections.addAll(studentList, new Student("a", 1), new Student("c", 0),
                new Student("b", 3));
        System.out.println(studentList); // [Name: a. Age: 1, Name: c. Age: 0, Name: b. Age: 3]
        Collections.sort(studentList); // object/class truyền vào cần implement Comparable Interface
        System.out.println(studentList); // [Name: c. Age: 0, Name: a. Age: 1, Name: b. Age: 3]
    }
}
