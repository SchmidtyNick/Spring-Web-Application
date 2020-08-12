package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //This controller is called by either a blank, a / or /index
    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        return "index";
    }
}
