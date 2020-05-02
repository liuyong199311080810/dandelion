package com.wisdom.dandelion;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHelloHystric implements WebApplication.SchedualServiceHello {

    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry "+name;
    }
}
