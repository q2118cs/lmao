package com.cool.app;

import com.cool.properties.AuthorProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 孙瑞 on 2016/11/13.
 */
@RestController
@SpringBootApplication
public class TestApplication {

    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    String index() {
        AuthorProperties properties = new AuthorProperties();
        return "book author is " + properties.getAuthor() + " <br/> book name is " + properties.getName();
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TestApplication.class);
        app.run(args);
    }
}
