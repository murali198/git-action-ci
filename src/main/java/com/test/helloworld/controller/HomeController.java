package com.test.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class HomeController {

    @GetMapping()
    public String echo(@RequestParam(name = "value", required = false) String value) {
        return "Hello: "+ value;
    }

}
