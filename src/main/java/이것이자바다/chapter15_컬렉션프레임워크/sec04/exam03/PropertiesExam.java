package 이것이자바다.chapter15_컬렉션프레임워크.sec04.exam03;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExam {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
//        properties.load(new FileReader("c:/~/database.properties"));

        String path = PropertiesExam.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println(driver);
        System.out.println(url);

    }

}
