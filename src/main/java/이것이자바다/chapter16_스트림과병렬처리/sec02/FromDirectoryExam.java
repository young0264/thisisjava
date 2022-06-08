package 이것이자바다.chapter16_스트림과병렬처리.sec02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExam {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/nam-uiyeong/Desktop/의영/개발/thisisjava/src/main/java/이것이자바다");
        Stream<Path> stream = Files.list(path);
        stream.forEach(x -> System.out.println(x));
    }
}
