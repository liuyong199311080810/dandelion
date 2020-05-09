package com.wisdom.dandelion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run( ServiceApplication.class, args );
    }

    private Logger logger = LoggerFactory.getLogger(ServiceApplication.class);

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        logger.info("ELK测试");
        return "hi " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hello " + name + " ,i am from port:" + port;
    }
}
