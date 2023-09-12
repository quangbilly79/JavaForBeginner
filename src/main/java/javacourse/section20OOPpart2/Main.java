package javacourse.section20OOPpart2;

public class Main {
    public static void main(String[] args) {
        // Fan Class
        Fan fan1 = new Fan("Manufacturer 1", 0.34567, "Green");
        System.out.println(fan1); // isOn - false, speed - 0
        fan1.switchFan();
        System.out.println(fan1); // isOn - true, speed - 10
        fan1.switchFan();
        System.out.println(fan1); // isOn - false, speed - 0
        // Rectangle Class
        Rectangle rectangle1 = new Rectangle(3.5,4.6);
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.perimeter());

        // Book Class
        Book book1 = new Book(1, "book1", "athor1");
        book1.addReview(new Review(1, "good", 2));
        book1.addReview(new Review(2, "bad", 3));
        System.out.println(book1);

        // Person/Student/Employee class
        // Student kế thừa Person vs các method/field
        Student student1 = new Student("a", "b", "c", "e", 2000);
        student1.getName();
        // Có thể tạo như bên dưới do Person là cha, ngc lại k đc
        Person student2 =  new Student("a", "c", "e", "g", 2001);
        Employee employee1 = new Employee("a", "c", "e", "g", "h",
                1, 2);
        System.out.println(employee1);
        // Check xem 1 instance có thuộc 1 class k
        System.out.println(employee1 instanceof Person);

        // Animal/Dog abstract class
        // Abstract class k thể tạo instance trực tiếp
        //Animal animal1 = new Animal();
        Animal dog1 = new Dog();
        System.out.println(dog1.i);
        dog1.i = 4;
        // Interface
        ExtendInterface interface1 = new ExtendInterface();
        System.out.println(interface1.i);
        interface1.method1();
        // Lỗi vì field trong interface là final, k chỉnh đc
        // Trong khi instance tạo ra từ class kế thừa abstract class thì chỉnh vô tư
        // interface1.i = 3;

    }
}
