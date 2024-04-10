package com.edigest.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myClass {

    @GetMapping("hello")
    public String sayHello(){
        return "Hello, World";
    }
}
