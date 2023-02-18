package udemy.Section57.Lesson457;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

/**
 * Created by Binh
 * Date : 2/18/2023 - 9:52 PM
 * Description :
 */
public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Student st = mapper.readValue(new File("src/main/java/udemy/Section57/Lesson457/sample.json"), Student.class);

//      nếu xài cách này thì trong class Student không được có construtor hay constructor rỗng
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File("src/main/java/udemy/Section57/Lesson457/output.json"),st);

    }
}
