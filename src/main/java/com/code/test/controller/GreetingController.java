package com.code.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        log.info("GreetingController.greeting Function Point, return \"Hello\"");
        return "Hello";
    }
}
