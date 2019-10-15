package xyz.vaith.permission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello, permission";
    }
}
