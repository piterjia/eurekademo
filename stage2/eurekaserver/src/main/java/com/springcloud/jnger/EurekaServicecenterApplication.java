package com.springcloud.jnger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServicecenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServicecenterApplication.class, args);
    }
}
