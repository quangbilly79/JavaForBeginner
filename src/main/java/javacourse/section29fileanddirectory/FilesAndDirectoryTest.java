package javacourse.section29fileanddirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilesAndDirectoryTest {
    public static void main(String[] args) throws IOException {
        // convert String thành Path vs Paths.get
        // Lấy list path vs Files.list(path), trả về Stream
        Path path = Paths.get("./");
        Stream<Path> listFile = Files.list(path);
        listFile.forEach(System.out::println);

        // Bên trên tg đương vs bên dưới
        Files.list(path).forEach(System.out::println);
        System.out.println("----------");

        // Files.walk để quét từng file trong path theo depth, trả về Stream các Path
        Files.walk(path,2).forEach(System.out::println);
        System.out.println("----------");
        // Sau khi walk có thể filter, tham số nhận vào là 1 Predicate, trả về Stream các Path
        Predicate<? super java.nio.file.Path> predicate =
                elem -> elem.toString().contains(".xml");
        Files.walk(path,2).filter(predicate).forEach(System.out::println);
        System.out.println("----------");

        // Hoặc có thể find trực tiếp vs Files.find(), tham số là Path, depth, BiPredicate
        // BiPredicate nhận 2 tham số như bên dưới, trả về 1 boolean
        // find trả về Stream các Path
        BiPredicate<Path, BasicFileAttributes> biPredicate =
                // nếu là folder thì trả về true
                (pathInput, attributeInput) -> (attributeInput.isDirectory());
        Files.find(path, 4, biPredicate).forEach(System.out::println);
        System.out.println("----------");
    }
}
