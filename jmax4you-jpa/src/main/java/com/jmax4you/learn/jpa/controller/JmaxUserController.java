package com.jmax4you.learn.jpa.controller;

import com.jmax4you.learn.jpa.model.JmaxUser;
import com.jmax4you.learn.jpa.service.JmaxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author max.zheng
 * @date 2020-04-23 09:13
 */
@Controller
@RequestMapping(value = "/jmaxUser")
public class JmaxUserController {
    @Autowired
    private JmaxUserService jmaxUserService;
    @RequestMapping(value = "/save")
    @ResponseBody
    public String save(JmaxUser item) {
        jmaxUserService.save(new JmaxUser().setBirthday(new Date()).setIdCard("350").setName("max"));
        return "ok";
    }

}
