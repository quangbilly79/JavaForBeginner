package javacourse.section29fileanddirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
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

        Scanner scanner = new Scanner(path);
        if (scanner.hasNext()) {
            System.out.println("scanner: "+ scanner.next());
        }
    }
}
