package com.wisdom.dandelion;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystric implements ApiApplication.SchedualService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
