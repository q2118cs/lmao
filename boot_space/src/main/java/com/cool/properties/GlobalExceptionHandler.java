package com.cool.properties;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error";


    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception {

        ModelAndView mav = new ModelAndView();
        mav.setViewName(DEFAULT_ERROR_VIEW);
        mav.addObject("exception", e);
        mav.addObject("url", request.getRequestURL());
        return mav;
    }

}
