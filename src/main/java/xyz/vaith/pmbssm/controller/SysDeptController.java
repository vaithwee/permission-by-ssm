package xyz.vaith.pmbssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.vaith.pmbssm.model.common.JsonData;
import xyz.vaith.pmbssm.param.DeptParam;
import xyz.vaith.pmbssm.service.SysDeptService;
import xyz.vaith.pmbssm.util.BeanValidator;

@RequestMapping("/sys/dept")
@Controller
public class SysDeptController {

    @Autowired
    SysDeptService service;

    @RequestMapping("/add.json")
    @ResponseBody
    public JsonData add(DeptParam param) {
        service.add(param);
        return JsonData.success(null);
    }
}
