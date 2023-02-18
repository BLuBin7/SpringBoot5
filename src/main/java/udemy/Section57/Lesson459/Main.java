package udemy.Section57.Lesson459;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Binh
 * Date : 2/18/2023 - 10:15 PM
 * Description : 459. Spring REST - JSON Jackson Demo - Processing JSON
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(new File("src/main/java/udemy/Section57/Lesson459/data2.json"),Student.class);

        try {

//      có 2 cách goi class trong class
//      cách 1 : addr chưa được khai bào để đọc json
//            Address addr = new Address();
//          ko được dùng addr.getCity() vì addr ko đọc đươc dữ liệu trong json
//          do chỉ có student khai báo thôi chứ addr chua đc khai báo
//            System.out.println(student.getAddress().getCity());

//      cách 2 thì address được khai báo đọc được json thông qua student
        Address address = student.getAddress();
        System.out.println(address.getCity());

//      có 2 cách gọi mảng
//      cách 1 : languague chưa được khai báo để đọc json
//        System.out.println(Arrays.toString(student.getLanguagues()));

//      cách 2: languague được khai báo để đọc json thông qua student
        for( String templang : student.getLanguagues())
        {
            System.out.println(templang);
        }

        }catch(Exception exc){
            exc.printStackTrace();
        }
    }
}
