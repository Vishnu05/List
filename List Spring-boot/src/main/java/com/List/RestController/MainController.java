package com.List.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/test")
    public String test(){
        return "hot reloading is started this may case the system to heat up   ";
    }
}
