package 이것이자바다.chapter16_스트림과병렬처리.sec02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExam {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/이것이자바다/chapter16_스트림과병렬처리/sec02/linedata.txt");
        Stream<String> stream;

        //1. Files.lines() 메소드 이용
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        System.out.println();

        //2. BufferedReader lines 이용
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach(System.out::println);
    }
}
