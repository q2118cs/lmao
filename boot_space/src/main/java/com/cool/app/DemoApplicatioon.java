package com.cool.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 孙瑞 on 2017/2/6.
 */
@EnableEurekaServer
@SpringBootApplication
public class DemoApplicatioon {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoApplicatioon.class).web(true).run(args);
    }
}
