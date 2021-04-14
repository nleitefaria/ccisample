package com.nleitefaria.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nleitefaria.sample.model.Greeting;

@RestController
public class GreetingController {
    
    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting("Salut");
    }

}
