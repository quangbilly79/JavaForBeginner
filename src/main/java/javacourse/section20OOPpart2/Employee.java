package javacourse.section20OOPpart2;
// extend Person
public class Employee extends Person {
    String title;
    String employer;
    int employeeGrade;
    int salary;

    public Employee(String name, String email, String phoneNumber, String title,
                    String employer, int employeeGrade, int salary) {
        super(name, email, phoneNumber);
        this.title = title;
        this.employer = employer;
        this.employeeGrade = employeeGrade;
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", employeeGrade=" + employeeGrade +
                ", salary=" + salary +
                '}';
    }
}
