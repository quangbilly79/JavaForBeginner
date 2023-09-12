package javacourse.section18arrayarraylists;

import java.util.Arrays;

public class VarArgs {
    // varargs trong Java
    // Cú pháp: Kdl... tên tham số
    // Chỉ chấp nhận 1 varargs, phải đặt ở cuối
    // Có thể coi nó là 1 Array
    static void testVarArgs(int a, int... varargs) {
        System.out.printf("a: %s\nvarargs: %s\n", a, Arrays.toString(varargs));
        System.out.println(varargs.getClass());
    }

    public static void main(String[] args) {
        testVarArgs(3, 1,2,3);
        //a: 3
        //varargs: [1, 2, 3]
        //class [I
    }
}
