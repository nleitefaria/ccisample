package com.nleitefaria.sample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nleitefaria.sample.model.Greeting;

@RestController
public class GreetingController 
{
    @GetMapping("/greeting")
    public ResponseEntity<Greeting> greeting() {
        return ResponseEntity.ok(new Greeting("Salut"));
    }

}
