package com.cool.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 孙瑞 on 2016/11/13.
 */
@Component
@ConfigurationProperties(prefix = "book",locations = "classpath:application.properties")
public class AuthorProperties {

    private String author;

    private String name;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
