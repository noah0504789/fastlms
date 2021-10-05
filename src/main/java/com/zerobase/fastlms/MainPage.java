package com.zerobase.fastlms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    @RequestMapping("/")
    public String index() {
        return "Index page";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }



}
