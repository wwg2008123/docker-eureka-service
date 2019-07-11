package com.wwg.dockereurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DockerEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerEurekaServiceApplication.class, args);
        System.out.println("注册中心服务已启动！");
    }

}
