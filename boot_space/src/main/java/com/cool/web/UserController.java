package com.cool.web;

import com.cool.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 孙瑞 on 2017/2/20.
 */
public class UserController {

    @Autowired
    private WebUserService webUserService;

    @RequestMapping("/greeting")
    @ResponseBody
    public Object hello() {
        return "Hello Spring";
    }

    @ResponseBody
    @RequestMapping("/user")
    public Object get(@RequestParam String id) {
        return webUserService.findOneById(id);
    }
}
