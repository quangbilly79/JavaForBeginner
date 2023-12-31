package javacourse.section1jshelltest;

public class Method {
    // Phải declare bên ngoài method main
    // Phải thêm static nếu muốn gọi trực tiếp,
    // nếu k sẽ phải tạo instace kiểu Class instance = new Class(); method.function
    static void printMutiplicationTable(int i) {
        for(int j = 1; j<=10; j++){
            System.out.printf("%d x %d = %d\n", i, j, i*j);
        }
    }
    // Overload method: trong cùng 1 Class, cùng tên nhưng khác tham số
    void printMutiplicationTable(String i) {
        System.out.println(i);
    }
    public static void main(String[] args) {
        Void a = null;
        Method methodInstance = new Method();
        // Access non static method thông qua instance
        methodInstance.printMutiplicationTable("a");
        // Access static method trực tiếp (có thể bỏ Method.)
        Method.printMutiplicationTable(3);
    }
}
