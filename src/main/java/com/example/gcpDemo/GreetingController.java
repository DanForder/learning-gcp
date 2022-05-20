package com.example.gcpDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello, I'm on the cloud and auto deployed";
    }
}
