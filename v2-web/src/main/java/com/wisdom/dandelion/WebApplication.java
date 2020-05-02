package com.wisdom.dandelion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run( WebApplication.class, args );
    }

    @FeignClient(value = "service",fallback = SchedualServiceHelloHystric.class)
    public interface SchedualServiceHello {
        @RequestMapping(value = "/hello",method = RequestMethod.GET)
        String sayHelloFromClientOne(@RequestParam(value = "name") String name);
    }

}
