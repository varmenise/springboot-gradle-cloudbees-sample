package com.msgilligan.springboot.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/hello-rest")
    public String index() {
        return "Greetings from Spring Boot and CloudBees!";
    }

}
