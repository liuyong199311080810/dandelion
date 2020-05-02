package com.wisdom.dandelion;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements ApiApplication.SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
