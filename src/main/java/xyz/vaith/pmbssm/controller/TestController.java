package xyz.vaith.pmbssm.controller;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@Log4j2
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        log.info("hello, info");
        return "hello, permission";
    }
}
