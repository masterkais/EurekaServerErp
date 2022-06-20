package com.example.eurekaservererp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerErpApplication.class, args);
    }

}
