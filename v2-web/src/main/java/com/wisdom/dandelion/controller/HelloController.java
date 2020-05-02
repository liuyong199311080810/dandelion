package com.wisdom.dandelion.controller;

import com.wisdom.dandelion.WebApplication.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    SchedualServiceHello SchedualServiceHello;

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam String name) {
        return SchedualServiceHello.sayHelloFromClientOne( name );
    }

}
