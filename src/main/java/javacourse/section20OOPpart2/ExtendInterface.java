package javacourse.section20OOPpart2;
// Kế thừa interface dùng "implements"
public class ExtendInterface implements Interface {
    // Tương tự abstract, phải kế thừ đủ các method từ class cha
    // Tuy vậy method phải public,
    // vì method trong interface mặc định là public,
    // trong khi method trong class bthg là private-package (restric hơn public)
    public void method1() {
        System.out.println("Abc");
    }
    public void method2(int c) {
        System.out.println("cde");
    }

}
