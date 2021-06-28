package com.sgr0416st.loggingdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/")
    public String getHello(){
        log.info("{}: return response", LocalDateTime.now());
        return "Hello, World";
    }
}