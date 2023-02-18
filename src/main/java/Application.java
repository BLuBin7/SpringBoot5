package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer;

import java.util.List;

@SpringBootApplication
public class Application {

	private PageableHandlerMethodArgumentResolverCustomizer pageableCustomizer;

	public static void main(String[] args) {
//		cách khai báo list
//		List<String> arrayaslist = List.of ("a","b","c","d");
//		System.out.println(arrayaslist);

		SpringApplication.run(Application.class, args);
	}


}
