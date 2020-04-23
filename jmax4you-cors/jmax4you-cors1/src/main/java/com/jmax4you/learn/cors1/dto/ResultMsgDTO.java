package com.jmax4you.learn.cors1.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author max.zheng
 * @date 2020-04-12 21:23
 */
@Data
public class ResultMsgDTO implements Serializable {
    private String code;
    private Object result;
    private String msg;
}
