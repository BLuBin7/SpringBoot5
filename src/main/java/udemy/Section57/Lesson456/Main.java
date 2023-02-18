package com.learn.udemy.Section57.Lesson456;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Binh
 * Date : 2/18/2023 - 6:38 PM
 * Description :
 */
public class Main {
    public static void main(String[] args) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
//
//    Student student = mapper.readValue(new File("src/main/data.json"),Student.class );

        Student st = new Student(17 ,"BluBin",  "Bin",true);

        mapper.writeValue(new File("src/main/data.json"),st);
//        System.out.println(student.getFirstName());
    }


}
