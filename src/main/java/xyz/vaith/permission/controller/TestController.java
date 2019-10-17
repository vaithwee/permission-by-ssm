package xyz.vaith.permission.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.vaith.permission.common.JsonData;
import xyz.vaith.permission.common.ParamException;
import xyz.vaith.permission.common.PermissionException;
import xyz.vaith.permission.param.TestParam;
import xyz.vaith.permission.validator.BeanValidator;

import java.util.Map;

@RequestMapping("/test")
@Controller
@Slf4j
public class TestController {
    @RequestMapping("/hello.json")
    @ResponseBody
    public JsonData hello() {
        log.info("hello permission");
//        throw new PermissionException("hello permission");
        return JsonData.success("hello, permission");
    }

    @RequestMapping("/validate.json")
    @ResponseBody
    public JsonData validate(TestParam param) {
        Map<String, String> result = BeanValidator.validate(param);
        if (!result.isEmpty()) {
            throw new ParamException(result.toString());
        }
        return JsonData.success("validate");
    }
}
