package com.cool.web;

import com.cool.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 孙瑞 on 2017/2/10.
 */
@RestController
@SpringBootApplication
public class AngularPersonController {

//    @RequestMapping(value = "/action")
//    public String index() {
//        return "action";
//    }

    @RequestMapping(value = "/search", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person search(String personName) {
        System.out.println("执行了》》》》");
        return new Person(personName, 22, "北京");
    }

    public static void main(String[] args) {
        SpringApplication.run(AngularPersonController.class, args);
    }
}
