package com.cool.web;

import com.cool.app.TestApplication;
import com.cool.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 孙瑞 on 2017/2/9.
 */
@Controller
@SpringBootApplication
public class PersonController {

    @RequestMapping("/")
    public String index(Model model) {
        Person single = new Person("aa", 11);
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("bb", 22);
        Person p2 = new Person("cc", 33);
        Person p3 = new Person("dd", 44);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("persons", persons);
        return "action";
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(PersonController.class);
        app.run(args);
    }
}
