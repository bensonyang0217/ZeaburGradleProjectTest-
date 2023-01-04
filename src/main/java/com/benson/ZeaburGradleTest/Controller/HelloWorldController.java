package com.benson.ZeaburGradleTest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index(){
        return "Hello Zeabur Gradle Project!";
    }
}
