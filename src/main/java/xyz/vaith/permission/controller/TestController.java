package xyz.vaith.permission.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.vaith.permission.common.PermissionException;

@RequestMapping("/test")
@Controller
@Slf4j
public class TestController {
    @RequestMapping("/hello.json")
    @ResponseBody
    public String hello() {
        log.info("hello permission");
//        throw new PermissionException("hello permission");
        return "hello, permission";
    }
}
