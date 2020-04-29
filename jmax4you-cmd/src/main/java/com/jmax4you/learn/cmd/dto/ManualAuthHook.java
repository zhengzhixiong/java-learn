package com.jmax4you.learn.cmd.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author max.zheng
 * @date 2020-04-28 17:47
 */
@Data
public class ManualAuthHook implements Serializable {
    private String domain;
    private String validation;
    private String token;
    private String remaining;
    private String allDomains;
}
