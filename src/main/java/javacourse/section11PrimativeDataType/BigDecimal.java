package javacourse.section11PrimativeDataType;

public class BigDecimal {
    public static void main(String[] args) {
        // Dùng Big Decimal để tính toán chính xác khi thao tác vs số double/float
        java.math.BigDecimal num1 = new java.math.BigDecimal("0.1"); // truyền vào String cho chuẩn
        java.math.BigDecimal num2 = new java.math.BigDecimal("0.2");
        System.out.println(num1.add(num2)); // 0.3 (dùng Big Decimal ra đúng kq)
        System.out.println(0.1+0.2); // 0.30000000000000004 (sai số khi tính toán bthg)

    }
}
