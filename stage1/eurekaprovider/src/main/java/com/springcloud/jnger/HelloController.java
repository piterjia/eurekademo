package com.springcloud.jnger;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(String name) {
        return name + ", Welcome to service provider";
    }

}
