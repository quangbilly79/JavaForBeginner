package javacourse.section11primativedatatype;

import java.math.BigDecimal;

public class TestDataType {
    public static void main(String[] args) {
        System.out.println(Byte.SIZE); // 8 bits
        System.out.println((Byte.BYTES)); // 1 byte
        System.out.println(Byte.MAX_VALUE); // 127
        System.out.println(Byte.MIN_VALUE); // -128

        System.out.println(Character.SIZE); // 16 bits
        System.out.println(Character.BYTES); // 2 bytes
        System.out.println(Character.MAX_VALUE); // \uFFFF (UTF-16)
        System.out.println(Character.MIN_VALUE); // \u0000 (UTF-16)

        long i = 1000; // đc vì tự động cv từ int (kdl bé) sang long (kdl lớn)
        // long y = 1000000000000; // lỗi vì số quá lớn cho int
        long y = 1000000000000L; // phải thêm "l"/"L" ở cuối ms đích xác là kdl long
        // int z = y; // lỗi vì k thể cast từ long (kdl lớn) sang int (kdl bé)
        int z = (int) y; // -727379968. Phải explicit cast (lớn sang bé)
        int k = 3;
        long x = k; // ok vì có thể cast từ int (kdl bé) sang long (kdl lớn) (impicit cast)

        int a = 010; // tự động cv từ octal (mọi số bđ = "0", 0-7) sang int (8)
        int b = 0x10; // tự động cv từ hex (mọi số bđ = "0x", 0-F) sang int (16)

        float f = 1.5f; // float is 4 bytes, phải thêm "f"/"F"
        double d = 1.5; // double is 8 bytes
        double d1 = 1.5f; // => có thể implicit cast từ float thành double
        // float f1 = 1.5; // => lỗi k thể explicit cast từ double thành float
        float f1 = (float) 1.5; // => phải dùng (float) val
        f1++; // 2.5. Tương tự --,+=,-=,...
        // int i1 = f1; // => lỗi k thể explicit cast từ float thành int
        int i1 = (int) f1; // => phải dùng (int) val (2)
        float f2 = i1; // => có thể implicit cast từ int thành float (2.0)

        // Dùng Big Decimal để tính toán chính xác khi thao tác vs số double/float
        BigDecimal num1 = new BigDecimal("0.1"); // truyền vào String cho chuẩn
        BigDecimal num2 = new BigDecimal("0.2");
        System.out.println(num1.add(num2)); // 0.3 (dùng Big Decimal ra đúng kq)
        System.out.println(0.1+0.2); // 0.30000000000000004

        // char lưu mất 2 bytes
        char charVar = 'a'; // Dùng ngoặc ''
        char charVar1 = '\u0022'; // Có thể dùng "\"u để gõ kí tự unicode k có trên bàn phím (")
        char charVar2 = 65; // Có thể dùng mã unicode (A)
        charVar2++; // B
        charVar2 += 1; // C
        int intCharVar2 = (int)charVar2; // 67
        char charVar3 = '\n'; // Các kí tự xuống dòng, tab, khi in ra sẽ có hiệu ứng tg ứng
        System.out.println(charVar + " " + charVar1 + " " + charVar2 + " " + intCharVar2);
        Character charVar4 = 'x'; // Tạo vs wrap class Character
        for (char charVar5 = 'a'; charVar5 <= 'z'; charVar5++) {
            System.out.println(charVar5);
        }

    }
}
