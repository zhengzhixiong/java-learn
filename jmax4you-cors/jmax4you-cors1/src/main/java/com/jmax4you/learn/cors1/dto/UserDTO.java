package com.jmax4you.learn.cors1.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author max.zheng
 * @date 2020-04-12 21:21
 */
@Data
public class UserDTO implements Serializable {
    private String userName;
    private String password;
    private Integer age;
}
