package com.uj.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class SecondController {

    @GetMapping("/message")
    public String test(){
        return "Hello UJ Called in Second Service";
    }

}
