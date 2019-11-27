package xyz.vaith.pmbssm.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import xyz.vaith.pmbssm.enums.ResultCode;
import xyz.vaith.pmbssm.model.common.JsonData;

public class PermissionManagerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) {
        String url = httpServletRequest.getRequestURL().toString();
        ModelAndView mv;
        if (url.endsWith(".json")) {
            if (e instanceof PermissionException) {
                JsonData jsonData = JsonData.fail(((PermissionException)e).getCode());
                mv = new ModelAndView("jsonView", jsonData.toMap());
            } else  {
                JsonData jsonData = JsonData.fail(ResultCode.SYSTEM_ERROR);
                mv = new ModelAndView("jsonView", jsonData.toMap());
            }
        } else if (url.endsWith(".page")) {
            JsonData jsonData = JsonData.fail(ResultCode.SYSTEM_ERROR);
            mv = new ModelAndView("exception", jsonData.toMap());
        } else  {
            JsonData jsonData = JsonData.fail(ResultCode.SYSTEM_ERROR);
            mv = new ModelAndView("jsonView", jsonData.toMap());
        }
        return mv;
    }
}
