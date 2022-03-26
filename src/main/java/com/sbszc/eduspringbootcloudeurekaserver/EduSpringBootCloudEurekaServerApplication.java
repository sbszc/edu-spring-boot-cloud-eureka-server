package com.sbszc.eduspringbootcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EduSpringBootCloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduSpringBootCloudEurekaServerApplication.class, args);
    }

}
