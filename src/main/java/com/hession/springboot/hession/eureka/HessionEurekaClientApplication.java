package com.hession.springboot.hession.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HessionEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HessionEurekaClientApplication.class, args);
    }

}
