package javacourse.section29fileanddirectory;


import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FileRead {
    public static void main(String[] args) throws IOException {
        // Lay' dg dan~ hien. tai. cua? code vs FileSystems
        Path sysPath = FileSystems.getDefault().getPath("").toAbsolutePath();
        System.out.println(sysPath); // /home/quang/JavaProjects/JavaForBeginner

        // Doc. vs relative path
        Path path = Paths.get("src/main/resources/test.txt");
        // Doc. tat' ca? cac' dong` vs Files.readAllLines(path). Tra? ve` List<String>
        List<String> fileAllLines = Files.readAllLines(path);
        System.out.println(fileAllLines); //[avcd, ef, 1, 2, 3, gh]
        // Doc. tung` dong` vs Files.lines(path) (tra? ve` Stream<String>)
        // Sau do' co' the? dung` filter, foreach,...
        Stream<String> fileEachLine = Files.lines(path);
        fileEachLine
                .filter(line -> line.contains("a"))
                .forEach(System.out::println);

        // Write ra file vs .write Dau` vao` la` 1 List cac' dong`
        Path outputPath = Paths.get("src/main/resources/testOutput.txt");
        List<String> writeData = new ArrayList<>();
        Collections.addAll(writeData, "c", "d", "g");
        Files.write(outputPath, writeData);
        System.out.println("writed");
    }

}
