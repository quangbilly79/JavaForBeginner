package javacourse.section25functionalprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class forEachInteger implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer*integer);
    }
}

class mapInteger implements Function<Integer, String> {
    @Override
    public String apply(Integer integer) {
        return integer.toString() + "_abc";
    }
}
// Method reference: class::func
class methodReferrenceTest {
    public static void printCustom(Integer i) {
        System.out.println(i);
    }
    public static boolean isEven(Integer i) {
        return i%2 == 0;
    }
    public static Integer maxOf(Integer i1, Integer i2) {
        return Integer.max(i1, i2);
    }
    public static int comapreTo(Integer i1, Integer i2) {
        if (i1 > i2) {
            return -1;
        } else if (i1 == i2) {
            return 0;
        }
        return 1;
    }
}

public class FunctionalExercise {
    public static void main(String[] args) {
        Comparator<String> testComparator = (String x, String y) -> Integer.compare(x.length(), y.length());
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList,1,3,4,2,5,5,4);
        integerList.stream().forEach(new forEachInteger());
        System.out.println("-----------");
        integerList.stream().map(new mapInteger()).forEach(System.out::println);
        //1_abc
        //3_abc
        //4_abc ...
        // Vd đơn giản về Method reference
        integerList.stream().map(i -> i.byteValue());
        integerList.stream().map(Integer::byteValue);
        // Vd về custom Method reference
        integerList.stream().forEach(i -> methodReferrenceTest.printCustom(i));
        integerList.stream().forEach(methodReferrenceTest::printCustom);

        integerList.stream().filter(methodReferrenceTest::isEven);

        integerList.stream().max(methodReferrenceTest::maxOf);
        System.out.println("-----------");
        integerList.stream().sorted(methodReferrenceTest::comapreTo).forEach(System.out::println);

        // stringList.stream().sorted(testComparator).forEach(System.out::println);
    }
}
