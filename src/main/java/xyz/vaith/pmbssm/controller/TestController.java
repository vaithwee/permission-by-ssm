package xyz.vaith.pmbssm.controller;

import com.google.common.base.Preconditions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.vaith.pmbssm.enums.ResultCode;
import xyz.vaith.pmbssm.exception.PermissionException;
import xyz.vaith.pmbssm.mapper.SysAclModuleMapper;
import xyz.vaith.pmbssm.model.SysAclModule;
import xyz.vaith.pmbssm.model.TestVo;
import xyz.vaith.pmbssm.model.common.JsonData;
import xyz.vaith.pmbssm.util.ApplicationContextHelper;
import xyz.vaith.pmbssm.validate.BeanValidator;

import java.util.Collections;
import java.util.Map;

@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping("/hello.json")
    @ResponseBody
    public JsonData hello() {
        log.info("hello, info");
        throw new PermissionException(ResultCode.NO_AUTH);
//        return JsonData.success("hello, permission");
    }

    @RequestMapping("/hello.page")
    public String helloPage() {
        int a = 10 / 0;
        return "hello";
    }

    @RequestMapping("/validate.json")
    @ResponseBody
    public JsonData validate(TestVo testVo) {
        Map<String, String> result = BeanValidator.validate(testVo);
        if (result !=null && result.entrySet().size() > 0) {
            String message = "";
            for (Map.Entry<String, String> entry : result.entrySet()) {
                message += entry.getKey() + ":" + entry.getValue() + "  ";
            }
            ResultCode code = ResultCode.PARAM_ERROR;
            code.setMessage(message);
            return JsonData.fail(code);
        }
        SysAclModuleMapper moduleMapper = ApplicationContextHelper.popBean(SysAclModuleMapper.class);
        SysAclModule sysAclModule = moduleMapper.selectByPrimaryKey(1);
        log.info("sysAclModule : {}" , sysAclModule);
        return JsonData.success(testVo);
    }
}
