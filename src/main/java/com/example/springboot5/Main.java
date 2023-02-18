
package com.example.springboot5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer;

/**
 * Created by Binh
 * Date : 2/18/2023 - 6:10 PM
 * Description :
 */
@SpringBootApplication
public class Main {


    public static void main(String[] args) {
//		cách khai báo list
//		List<String> arrayaslist = List.of ("a","b","c","d");
//		System.out.println(arrayaslist);

        SpringApplication.run(Main.class, args);
    }
}

