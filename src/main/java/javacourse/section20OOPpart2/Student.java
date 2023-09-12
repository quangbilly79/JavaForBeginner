package javacourse.section20OOPpart2;

// Student Inherit Person Class
public class Student extends Person {
    private String collegeName;
    private int year;

    // Constructor phải đủ các field trong Constructor từ class cha (trong TH class cha k có default Con)
    public Student(String name, String email, String phoneNumber, String collegeName, int year) {
        // super: gọi class cha. Trong TH này là gọi constructor
        super(name, email, phoneNumber);
        this.collegeName = collegeName;
        this.year = year;
    }

}
