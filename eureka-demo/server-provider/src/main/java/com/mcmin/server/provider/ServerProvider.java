package com.mcmin.server.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class ServerProvider {
    public static void main(String[] args) {
        SpringApplication.run(ServerProvider.class, args);
    }
}
