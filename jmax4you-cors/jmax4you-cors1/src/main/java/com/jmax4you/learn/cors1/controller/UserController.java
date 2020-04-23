package com.jmax4you.learn.cors1.controller;

import com.jmax4you.learn.cors1.config.CustomRequest;
import com.jmax4you.learn.cors1.dto.ResultMsgDTO;
import com.jmax4you.learn.cors1.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author max.zheng
 * @date 2020-04-12 21:20
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/add")
    @ResponseBody
    public ResultMsgDTO add(@CustomRequest UserDTO user) {

        return new ResultMsgDTO();

    }
}
