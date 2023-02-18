package udemy.Section57.Lesson456;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Binh
 * Date : 2/18/2023 - 6:38 PM
 * Description :
 */
public class Main {
//  lưu ý : file json không được để thừa dấu cách, ko match được với bên java pojo thì sẽ ko chạy được
    public static void main(String[] args) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
//    đợc dữ liệu từ Json sang Java POJO bằng setter
//    Student student = mapper.readValue(new File("src/main/java/udemy/Section57/Lesson456/sample.json"),Student.class );
//        System.out.println(student.getFirstName());

//    ghi dữ liệu từ Java POJO sang Json bằng getter
        Student st = new Student(19 ,"BluBin",  "Bin",true);
        mapper.writeValue(new File("src/main/data.json"),st);

    }


}
