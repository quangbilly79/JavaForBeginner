package javacourse.section20OOPpart2;

public interface Interface {
    // Field trong Interface mặc định là final
    int i = 0;
    String s = "a";
    // Tương tự abstract, method k đc có body.
    // Khác ở chỗ Luôn luôn là public
    // K cần từ khóa abstract
    // Ngoài ra k đc chứa method thg giống như abstract class
    void method1();
    void method2(int a);

}
