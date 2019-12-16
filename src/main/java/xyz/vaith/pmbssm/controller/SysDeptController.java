package xyz.vaith.pmbssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.vaith.pmbssm.model.SysDept;
import xyz.vaith.pmbssm.model.common.JsonData;
import xyz.vaith.pmbssm.param.DeptParam;
import xyz.vaith.pmbssm.service.SysDeptService;
import xyz.vaith.pmbssm.service.SysTreeService;
import xyz.vaith.pmbssm.util.BeanValidator;

@RequestMapping("/sys/dept")
@Controller
public class SysDeptController {

    @Autowired
    SysDeptService service;

    @Autowired
    SysTreeService treeService;

    @RequestMapping("/add.json")
    @ResponseBody
    public JsonData add(DeptParam param) {
        SysDept dept = service.add(param);
        return JsonData.success(dept);
    }

    @RequestMapping("/tree.json")
    @ResponseBody
    public JsonData tree() {
        return JsonData.success(treeService.getDeptTree());
    }
}
