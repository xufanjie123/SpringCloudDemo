package com.example.eurekaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaconfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaconfigserverApplication.class, args);
    }
}
