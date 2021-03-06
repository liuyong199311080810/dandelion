package com.wisdom.dandelion.controller;

import com.wisdom.dandelion.ApiApplication.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HiController {

    @Autowired
    SchedualService schedualService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualService.sayHiFromClientOne( name );
    }

}
