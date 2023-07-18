package com.example.spring_begining;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody //return the index as a Strings
public class TestController {

    @RequestMapping("/test")
    public String firstHandler() {
        return "<h1>Just for testing</h1>";
    }
}
