package xyz.vaith.pmbssm.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.runtime.Log;
import xyz.vaith.pmbssm.enums.ResultCode;
import xyz.vaith.pmbssm.model.common.JsonData;

@Slf4j
public class PermissionManagerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) {
        String url = httpServletRequest.getRequestURL().toString();
        ModelAndView mv;
        log.error(e.getMessage());
        if (url.endsWith(".json")) {
            if (e instanceof PermissionException) {
                JsonData jsonData = JsonData.fail(((PermissionException) e).getCode());
                mv = new ModelAndView("jsonView", jsonData.toMap());
            } else {
                JsonData jsonData = JsonData.fail(ResultCode.SYSTEM_ERROR);
                mv = new ModelAndView("jsonView", jsonData.toMap());
            }
        } else if (url.endsWith(".page")) {
            JsonData jsonData = JsonData.fail(ResultCode.SYSTEM_ERROR);
            mv = new ModelAndView("exception", jsonData.toMap());
        } else {
            JsonData jsonData = JsonData.fail(ResultCode.SYSTEM_ERROR);
            mv = new ModelAndView("jsonView", jsonData.toMap());
        }
        return mv;
    }
}
